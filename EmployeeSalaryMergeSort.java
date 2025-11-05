import java.util.Scanner;
public class EmployeeSalaryMergeSort 
{
    void merge(double arr[], int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        double L[] = new double[n1];
        double R[] = new double[n2];
        for (int i = 0; i < n1; ++i)
        {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j)
        {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            } 
            else 
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) 
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(double arr[], int left, int right) 
    {
        if (left < right) 
        {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        double salary[] = new double[n];
        System.out.println("Enter employee salaries:");
        for (int i = 0; i < n; i++) 
        {
            salary[i] = sc.nextDouble();
        }

        EmployeeSalaryMergeSort obj = new EmployeeSalaryMergeSort();
        obj.sort(salary, 0, n - 1);
        System.out.println("\nSorted Employee Salaries:");
        for (double s : salary)
        {
            System.out.print(s + " ");
        }
    }
}