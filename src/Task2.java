import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int charges = 0;
        double minsCharge = 0;
        double chargingCost = 0;
        boolean validCharges = false;
        boolean validMins = false;
        do {
            System.out.println("Enter the number of battery charges available.");

            if (scan.hasNextInt()) {
                charges = scan.nextInt();

                if (charges >= 0) {
                    validCharges = true;
                } else {
                    System.out.println("Invalid. Your number must be greater than or equal to 0, and an integer.");
                }
            } else {
                System.out.println("Invalid. Your number must be greater than or equal to zero.");
                scan.next();
            }

        } while (validCharges == false);
        do {
            System.out.println("Enter minutes per charge.");
            if (scan.hasNextDouble()) {
                minsCharge = scan.nextDouble();
                if (minsCharge > 0) {
                    validMins = true;
                } else {
                    System.out.println("Invalid. Your value must be greater than 0.");
                }
            } else {
                System.out.println("Invalid. Use a number greater than 0.");
                scan.next();
            }
        }       while (validMins == false);

        boolean isCostValid = false;
        do {
            System.out.println("Enter cost per charge.");
            if (scan.hasNextDouble()) {
                chargingCost = scan.nextDouble();
                if (chargingCost > 0) {
                    isCostValid = true;
                } else {
                    System.out.println("Invalid. Number must be greater than 0.");
                }
            } else {
                System.out.println("Invalid. Number must be greater then 0.");
                scan.next();
            }
        }       while (validMins == false);
        double totalMinutes = charges * minsCharge;
        double costPerHour = (60.0 / minsCharge) * chargingCost;
        System.out.printf("Total available minutes: %.2f%n", totalMinutes);
        System.out.printf("Cost to run the robot for 60 minutes: $%.2f%n", costPerHour);

    }
}
