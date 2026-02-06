import java.util.*;
public class design_twitter {
    private Map<Integer, List<int[]>> tweets;
    private Map<Integer,Set<Integer>> following;
    private int time ;

    public design_twitter(){
        tweets = new HashMap<>();
        following = new HashMap<>();
        time =0;
    }

    void post_tweet(int user_id , int tweet_id){
        tweets.putIfAbsent(user_id, new ArrayList<>());
        tweets.get(user_id).add(new int[]{time++,tweet_id});
    }

    List<Integer> get_news_feed(int user_id){
        PriorityQueue<int[]> pq  = new PriorityQueue<>((a,b)->b[0]-a[0]);
        
        //adding own tweets
        if(tweets.containsKey(user_id)){
            for(int[] tweet : tweets.get(user_id)){
                pq.offer(tweet);
                if(pq.size()>10){
                    pq.poll();
                }
            }
        }

        //adding followed users tweets
        if(following.containsKey(user_id)){
            for(int followee : following.get(user_id)){
                if(tweets.containsKey(followee)){
                    for(int[] tweet : tweets.get(followee)){
                        pq.offer(tweet);
                        if(pq.size()>10){
                            pq.poll();
                        }
                    }
                }
            }
        }

        LinkedList<Integer> news_feed = new LinkedList<>();
        while(!pq.isEmpty()){
            news_feed.addFirst(pq.poll()[1]);
        }
        return news_feed;
    }

    void follow(int follower_id , int followee_id){
        following.putIfAbsent(follower_id, new HashSet<>());
        following.get(follower_id).add(followee_id);
    }

    void unfollow(int follower_id , int followee_id){
        if(following.containsKey(follower_id)){
            following.get(follower_id).remove(followee_id);
        }
    }

    public static void main(String[] args) {
        design_twitter twitter = new design_twitter();
        twitter.post_tweet(1, 5);
        twitter.post_tweet(1, 3);
        twitter.post_tweet(2, 6);
        twitter.follow(1, 2);
        List<Integer> news_feed = twitter.get_news_feed(1);
        System.out.println("User 1's news feed: " + news_feed);
        twitter.unfollow(1, 2);
        news_feed = twitter.get_news_feed(1);
        System.out.println("User 1's news feed after unfollowing user 2: " + news_feed);
    }
}
