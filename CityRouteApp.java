import java.util.*;
public class CityRouteApp 
{
    static final int INF = 9999;
    public static void dijkstra(int[][] graph, int src) 
    {
        int V = graph.length;
        int[] dist = new int[V];       
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, INF);
        dist[src] = 0;
        for (int count = 0; count < V - 1; count++) 
        {
            int u = minDistance(dist, visited);
            visited[u] = true;
            for (int v = 0; v < V; v++) 
            {
                if (!visited[v] && graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) 
                {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("\nShortest Distance from Source City:");
        for (int i = 0; i < V; i++) 
        {
            System.out.println("City " + (src + 1) + " -> City " + (i + 1) + " = " + dist[i]);
        }
    }

    private static int minDistance(int[] dist, boolean[] visited) 
    {
        int min = INF, minIndex = -1;
        for (int v = 0; v < dist.length; v++) 
        {
            if (!visited[v] && dist[v] <= min) 
            {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        System.out.println("Enter distance matrix between cities (0 if no direct road):");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter source city number (1 to " + n + "): ");
        int src = sc.nextInt() - 1;
        dijkstra(graph, src);
    }
}