import java.util.Scanner;
import java.util.Arrays;

public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruits = { "apple", "banana", "cherry", "grape", "mango", "orange", "pear", "pineapple", "strawberry",
                "watermelon", "kiwi", "peach", "plum", "raspberry", "blueberry" };
        int num = (int) (Math.random() * fruits.length);
        String selectedFruit = fruits[num];
        int attempts = 5;
        boolean guessedCorrectly = false;

        System.out.println("Guess the fruit! You have " + attempts + " attempts.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            String guess = sc.nextLine();

            if (guess.equals(selectedFruit)) {
                System.out.println("Congratulations! You guessed the word!");
                guessedCorrectly = true;
                break;
            } else if (guess.compareTo(selectedFruit) < 0) {
                System.out.println("The word is later in the dictionary.");
            } else {
                System.out.println("The word is earlier in the dictionary.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all attempts. The correct word was: " + selectedFruit);
        }
    }
}
