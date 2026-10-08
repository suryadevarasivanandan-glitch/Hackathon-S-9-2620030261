import java.util.Scanner;

public class WasteVehicle {

    // Method for 3c
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vehicleNumber = 101;
        double wasteCollected = 125.5;
        int collectionPoints = 10;
        char vehicleStatus = 'A';

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        System.out.print("\nEnter the waste collected in kgs: ");
        double waste = sc.nextDouble();

        if (waste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        System.out.print("\nEnter waste from collection point 1: ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste from collection point 2: ");
        double point2Waste = sc.nextDouble();

        double total = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + total + " kg");

        sc.close();
    }
}


