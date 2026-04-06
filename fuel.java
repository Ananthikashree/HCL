import java.util.Scanner;

public class fuel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage (km per liter): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price per liter: ");
        double fuelPrice = sc.nextDouble();

       
        double fuelNeeded = distance / mileage;
        double totalCost = fuelNeeded * fuelPrice;

       
        System.out.println("Fuel needed: " + fuelNeeded + " liters");
        System.out.println("Total travel cost: ₹" + totalCost);
    }
}