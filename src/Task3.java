import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lengthGarden = 0;
        double widthGarden = 0;
        double areaGarden = 0;
        boolean validLengthGarden = false;
        boolean validWidthGarden = false;
        do {
            System.out.println("Enter the length of your garden that is shaped like a trangle.");
            if (scan.hasNextDouble()) {
                lengthGarden = scan.nextDouble();
                if (lengthGarden > 0) {
                    validLengthGarden = true;
                } else {
                    System.out.println("Invalid. Enter a valid number.");
                }
            } else {
                System.out.println("Invalid. Enter a valid number.");
                scan.next();
            }

        } while (!validLengthGarden);
        do {
            System.out.println("Enter the width of your triangle shaped garden.");
            if (scan.hasNextDouble()) {
                widthGarden = scan.nextDouble();
                if (widthGarden > 0) {
                    validWidthGarden = true;
                } else {
                    System.out.println("Invalid. Please enter a valid number.");
                }
            } else {
                System.out.println("Invalid. Please enter a valid number.");
                scan.next();
            }

        } while (!validWidthGarden);


        areaGarden = (lengthGarden * widthGarden) / 2;
        double hypotenuse = Math.sqrt((lengthGarden * lengthGarden + widthGarden * widthGarden));
        double perimeter = lengthGarden + widthGarden + hypotenuse;
        System.out.printf("%-10s%10.2f", "Your garden length in feet is :", lengthGarden);
        System.out.printf("\n%-10s%10.2f", "Your garden width in feet is :", widthGarden);
        System.out.printf("\n%-10s%10.2f", "Your triangle shaped gardens area in feet is :", areaGarden);
        System.out.printf("\n%-10s%10.2f", "Your garden missing side in feet is :", hypotenuse);
        System.out.printf("\n%-10s%10.2f", "Your gardens perimeter in feet is :", perimeter);


    }
}
