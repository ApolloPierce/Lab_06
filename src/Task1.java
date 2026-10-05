import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km = 0;
        boolean validDistance = false;

        do {
            System.out.println("Enter the distance of the trail in kilometers without the unit.");

            if (scan.hasNextDouble()) {
                km = scan.nextDouble();
                if (km >= 0) {
                    validDistance = true;
                } else {
                    System.out.println("invalid. Your distance must be a valid number greater than or equal to zero.");
                }
            } else {
                System.out.println("invalid. Your distance must be a valid number greater than or equal to zero.");
                scan.next();
            }

        } while (validDistance == false);

        double mi = km * 0.621371;
        System.out.printf("%-12s%10.2f%n", "Kilometers:", km);
        System.out.printf("%-12s%10.2f%n", "Miles:", mi);
    }
}