import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {

        ArrayList<Double> prices = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        boolean done = false;
        double itemPrice = 0.0;
        double totalCost = 0.0;
        double averageCost = 0.0;

        do {
            itemPrice = SafeInput.getDouble(in, "Enter the price of the item: ");

            prices.add(itemPrice);
            totalCost += itemPrice;

            done = SafeInput.getYNConfirm(in, "Are you done?");
        } while (!done);

        averageCost = totalCost / prices.size();

        for (double price: prices)
        {
            System.out.println("Price: " + price);
        }

        System.out.println("Total Cost: " + totalCost);
        System.out.println("Average Cost: " + averageCost);
    }
}
