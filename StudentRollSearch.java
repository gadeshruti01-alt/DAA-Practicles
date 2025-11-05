import java.util.Scanner;
public class StudentRollSearch
{
    public static int binarySearch(int roll[],int low,int high,int key)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=(low+high)/2;
        if(roll[mid] == key)
        {
            return mid;
        }
        else if(roll[mid]>key)
        {
            return binarySearch(roll,low,mid-1,key);
        }
        else
        {
            return binarySearch(roll,mid+1,high,key);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of students:");
        int n=sc.nextInt();
        int roll[]=new int[n];
        System.out.println("Enter sorted roll numbers:");
        for(int i=0;i<n;i++)
        {
            roll[i]=sc.nextInt();
        }
        System.out.println("Enter roll number to search:");
        int key=sc.nextInt();
        int result=binarySearch(roll,0,n-1,key);
        if(result== -1)
        {
            System.out.println("Roll number not found in the list.");
        }
        else
        {
            System.out.println("Roll number found at position:" +(result +1));
        }
        sc.close();
    }
}