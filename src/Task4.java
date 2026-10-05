import java.util.Scanner;
    public class Task4 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTickets = (int)(Math.random() * 16) + 20;
        int playerGuess = 0;
        boolean validGuess = false;
        do {
            System.out.print("Estimate the ticket count (20-35):");
            if (scan.hasNextInt()) {
                playerGuess = scan.nextInt();
                if (playerGuess >= 20 && playerGuess <= 35) {
                    validGuess = true;
                } else {
                    System.out.println("Invalid. Please enter a value between 20 and 35, with no decimal.");
                }
            } else {
                System.out.println("Invalid. Please enter a valid integer.");
                scan.next();
            }
        } while (validGuess == false);
        System.out.println("The ticket amount was " + numberOfTickets + ".");
        if (playerGuess < numberOfTickets) {
            System.out.println("incorrect. Your estimate was too low.");
        } else if (playerGuess > numberOfTickets) {
            System.out.println("Incorrect. Your estimate was too high.");
        } else {
            System.out.println("Correct! Your guess was perfect!");
        }
    }
}
