import java.util.*;
public class NetworkDesignApp 
{
    public static void main(String[] args) 
    {
        int INF = 9999;  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of offices: ");
        int n = sc.nextInt();
        int[][] cost = new int[n][n];
        System.out.println("Enter the cost adjacency matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                cost[i][j] = sc.nextInt();
            }
        }
        boolean[] selected = new boolean[n];
        Arrays.fill(selected, false);
        selected[0] = true; 
        int totalCost = 0;
        int edges = 0;
        System.out.println("\nEdges in the Minimum Cost Network:");
        while (edges < n - 1) 
        {
            int min = INF;
            int x = 0, y = 0;
            for (int i = 0; i < n; i++) 
            {
                if (selected[i]) 
                {
                    for (int j = 0; j < n; j++) 
                    {
                        if (!selected[j] && cost[i][j] != 0 && cost[i][j] < min) 
                        {
                            min = cost[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
            }

            System.out.println("Office " + (x + 1) + " - Office " + (y + 1) + " : Cost = " + min);
            totalCost += min;
            selected[y] = true;
            edges++;
        }

        System.out.println("\nTotal Minimum Cost to Connect All Offices = " + totalCost);
    }
}