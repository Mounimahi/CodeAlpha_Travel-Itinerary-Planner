import java.util.ArrayList;
import java.util.Scanner;

public class TravelItineraryPlanner {
    static class Destination {
        String name;
        String date;
        double estimatedCost;

        public Destination(String name, String date, double estimatedCost) {
            this.name = name;
            this.date = date;
            this.estimatedCost = estimatedCost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Destination> itinerary = new ArrayList<>();

        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.println("How many destinations would you like to add?");
        int destinationCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input destinations
        for (int i = 0; i < destinationCount; i++) {
            System.out.println("Enter details for destination " + (i + 1) + ":");

            System.out.print("Destination name: ");
            String name = scanner.nextLine();

            System.out.print("Travel date (e.g., 2024-12-15): ");
            String date = scanner.nextLine();

            System.out.print("Estimated cost (in USD): ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            itinerary.add(new Destination(name, date, cost));
        }

        // Display itinerary
        System.out.println("\nYour Travel Itinerary:");
        double totalCost = 0;
        for (int i = 0; i < itinerary.size(); i++) {
            Destination dest = itinerary.get(i);
            System.out.println((i + 1) + ". " + dest.name + " - Date: " + dest.date + " - Estimated Cost: $" + dest.estimatedCost);
            totalCost += dest.estimatedCost;
        }

        // Display total cost
        System.out.println("\nTotal estimated cost: $" + totalCost);

        // Optional static weather info
        System.out.println("\nAdditional Info:");
        System.out.println("Remember to check the weather forecast for your destinations!");

        scanner.close();
    }
}