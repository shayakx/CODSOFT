import java.util.Scanner;

public class CODSOFT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Number Game!");
        System.out.println("You have " + chances + " chances  to win");
        while (playAgain) {
            int number = (int) (Math.random() * 100 + 1);
            int guess = 0;
            while (guess != number) {
                System.out.println("Guess a number between 1 and 100: ");
                guess = sc.nextInt();
                if (guess > number) {
                    System.out.println("Too high!");
                } else if (guess < number) {
                    System.out.println("Too low!");
                }
                chances++;
                if (chances == 5) {
                    System.out.println("You lose!");
                    System.out.println("The number was " + number);
                }
            }
            System.out.println("Do you want to play again? (y/n)");
            String answer = sc.next();
            if (answer.equals("y")) {
                playAgain = true;
                chances = 0;
            } else if (answer.equals("n")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        sc.close();
    }
}