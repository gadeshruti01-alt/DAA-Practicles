import java.util.*;
class Item 
{
    double profit, weight;
    Item(double profit, double weight) 
    {
        this.profit = profit;
        this.weight = weight;
    }
}

public class CargoKnapsackApp 
{
    public static double getMaxProfit(Item[] items, double capacity) 
    {
       
        Arrays.sort(items, (a, b) -> Double.compare( (b.profit / b.weight), (a.profit / a.weight)));

        double totalProfit = 0;
        double currentWeight = 0;

        for (Item i : items) 
        {
            if (currentWeight + i.weight <= capacity) 
            {
                currentWeight += i.weight;
                totalProfit += i.profit;
            } 
            else 
            {
                double remain = capacity - currentWeight;
                totalProfit += i.profit * (remain / i.weight);
                break;
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cargo items: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter profit and weight of item " + (i + 1) + ": ");
            double p = sc.nextDouble();
            double w = sc.nextDouble();
            items[i] = new Item(p, w);
        }

        System.out.print("Enter truck capacity: ");
        double capacity = sc.nextDouble();
        double maxProfit = getMaxProfit(items, capacity);
        System.out.println("\nMaximum profit that can be loaded = " + maxProfit);
    }
}
