import java.util.*;
public class m_coloring_problem {
    public boolean graphColoring(int[][] edges, int m, int n) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int[] colors = new int[n];
        return solve(0, m, n, colors, adj);
    }

    private static boolean solve(int node, int m, int n, int[] colors, List<List<Integer>> adj) {
        if (node == n) {
            return true; // All nodes are colored
        }

        for (int num = 1; num <= m; num++) {
            if (is_possible(node, num, colors, adj)) {
                colors[node] = num;
                if (solve(node + 1, m, n, colors, adj)) {
                    return true;
                }
                colors[node] = 0; 
            }
        }
        return false;
    }

    private static boolean is_possible(int node, int num, int[] colors, List<List<Integer>> adj) {
        for (int neighbor : adj.get(node)) {
            if (colors[neighbor] == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();
        System.out.println("Enter the number of edges:");
        int e = sc.nextInt();
        int[][] edges = new int[e][2];
        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < e; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        System.out.println("Enter the number of colors:");
        int m = sc.nextInt();

        m_coloring_problem obj = new m_coloring_problem();
        boolean canColor = obj.graphColoring(edges, m, n);
        if (canColor) {
            System.out.println("The graph can be colored with " + m + " colors.");
        } else {
            System.out.println("The graph cannot be colored with " + m + " colors.");
        }
        sc.close();
    }
}