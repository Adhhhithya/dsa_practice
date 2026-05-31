import java.util.*;
public class ninja_training {
    //Space Optimization
    public static int max_points(int points[][]){
        int n = points.length;
        int prev[] = new int[4];
        prev[0] = Math.max(points[0][1],points[0][2]);
        prev[1] = Math.max(points[0][0],points[0][2]);
        prev[2] = Math.max(points[0][0],points[0][1]);
        prev[3] = Math.max(points[0][0],Math.max(points[0][1],points[0][2]));

        for(int day=1;day<n;day++){
            int temp[] = new int[4];
            for(int last=0;last<4;last++){
                temp[last]=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        temp[last] = Math.max(temp[last],points[day][task]+ prev[task]);
                    }
                }
            }
            prev = temp;
        }
        return prev[3];

    }
    //Tabulation
    // public static int max_points(int points[][]){
    //     int n = points.length;
    //     int dp[][] = new int[n][4];
    //     dp[0][0] = Math.max(points[0][1],points[0][2]);
    //     dp[0][1] = Math.max(points[0][0],points[0][2]);
    //     dp[0][2] = Math.max(points[0][0],points[0][1]);
    //     dp[0][3] = Math.max(points[0][0],Math.max(points[0][1],points[0][2]));

    //     for(int day = 1;day<n;day++){
    //         for(int last=0;last<4;last++){
    //             dp[day][last] =0;
    //             for(int task=0;task<3;task++){
    //                 if(task!=last){
    //                     int point = points[day][task] + dp[day-1][task];
    //                     dp[day][last] = Math.max(dp[day][last],point);
    //                 }
    //             }
    //         }
    //     }
    //     return dp[n-1][3];

    // }
    //Memoization
    // private static int func(int day,int last,int points[][],int dp[][]){
    //     if(day==0){
    //         int maxi =0;
    //         for(int task=0;task<3;task++){
    //             if(task!=last){
    //                 maxi = Math.max(maxi,points[0][task]);
    //             }
    //         }
    //         return maxi;
    //     }
    //     if(dp[day][last]!=-1){
    //         return dp[day][last];
    //     }

    //     int maxi =0;
    //     for(int task=0;task<3;task++){
    //         if(task!=last){
    //             int point = points[day][task] + func(day-1,task,points,dp);
    //             maxi = Math.max(maxi,point);
    //         }
    //     }
    //     return dp[day][last] = maxi;
    // }
    // public static int max_points(int points[][]){
    //     int n  = points.length;
    //     int dp[][] = new int[n][4];
    //     for(int [] row:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return func(n-1,3,points,dp);
    // }
    //Recursive Solution
    // private static int func(int day,int last,int points[][]){
    //     if(day==0){
    //         int maxi=0;
    //         for(int task=0;task<3;task++){
    //             if(task!=last){
    //                 maxi = Math.max(maxi,points[0][task]);
    //             }
    //         }
    //         return maxi;
    //     }

    //     int maxi=0;
    //     for(int task=0;task<3;task++){
    //         if(task!=last){
    //             int point = points[day][task] + func(day-1,task,points);
    //             maxi = Math.max(maxi,point);
    //         }
    //     }
    //     return maxi;

    // }
    // public static int max_points(int points[][]){
    //     int n = points.length;
    //     return func(n-1,3,points);
    // }
    public static void main(String[] args){
        int points[][] = {{1,2,5},{3,1,1},{3,3,3}};
        System.out.println("The Maximum Points that can be earned "+max_points(points));
    }
}
