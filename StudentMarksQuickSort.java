import java.util.Scanner;
public class StudentMarksQuickSort 
{
    int partition(int arr[], int low, int high) 
    {
        int pivot = arr[high];  
        int i = (low - 1);
        for (int j = low; j < high; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) 
    {
        if (low < high) 
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) 
        {
            marks[i] = sc.nextInt();
        }
        StudentMarksQuickSort obj = new StudentMarksQuickSort();
        obj.quickSort(marks, 0, n - 1);
        System.out.println("\nSorted Marks (Merit List):");
        for (int mark : marks)
        {
            System.out.print(mark + " ");
        }
    }
}