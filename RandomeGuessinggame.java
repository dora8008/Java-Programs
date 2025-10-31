import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int guess;
        System.out.println("Guess a number between 1 and 100:");
        do {
            guess = sc.nextInt();
            if (guess < secret) System.out.println("Too low!");
            else if (guess > secret) System.out.println("Too high!");
            else System.out.println("🎉 Correct!");
        } while (guess != secret);
    }
}
