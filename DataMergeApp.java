import java.util.*;
public class DataMergeApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of log files: ");
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println("Enter size (in MB) of each log file:");
        for (int i = 0; i < n; i++) 
        {
            pq.add(sc.nextInt());
        }

        int totalTime = 0;

        while (pq.size() > 1) 
        {
            int first = pq.poll();   
            int second = pq.poll();  

            int mergeTime = first + second;
            totalTime += mergeTime;

            pq.add(mergeTime); 
        }

        System.out.println("\nMinimum total time to merge all log files = " + totalTime + " units");
    }
}
