import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // welcoming the player
        System.out.println("Welcome to the Number Guessing Game!");
        // asking user to put name of the player
        System.out.println("Please Enter your name : ");

        String playerName = in.nextLine();

        System.out.println("Hii ," + " " + playerName + "!");
        // function call
        GuessTheNumber(playerName);

    }

    public static void GuessTheNumber(String Name) {
        // generating random number
        int num = 100 + (int) (999 * Math.random());
        // Given trials to the player
        int Trials = 5;
        System.out.println(Name + ", " + "you have" + " " + Trials + " trials.");

        int i, guess;
        // Giving Hint to the player
        System.out.println("A number is between 100 to 999.");

        // iterating number of trials

        for (i = 0; i < Trials; i++) {
            System.out.print(Name + ", " + "Now Guess the Number : ");
            // take guess from user
            guess = in.nextInt();
            // printing statement according to the condition
            if (num == guess) {
                System.out.println("Congratulations! " + Name + " " + "You have guessed correct Number.");
                break;
            } else if (num > guess && i != Trials - 1) {
                System.out.println(Name + " " + " The number guessed by you is greater than " + guess);
                // Giving hint for Last Digit
                int lastDigit = num % 10;
                System.out.println("The last digit is : " + lastDigit);
                System.out.println("Try again!");
            } else if (num < guess && i != Trials - 1) {
                System.out.println(Name + " " + " The number guessed by you is less than " + guess);
                // Giving hint for first Digit
                int firstDigit = num / 100;
                System.out.println("The first digit is : " + firstDigit);
                System.out.println("Try again!");
            }
        }

        if (i == Trials) {
            System.out.println(Name + " " + "you have exhaused you trials.");
            System.out.println("The correct number was : " + num);
        }

        System.out.println("Play Again!");
    }
}
