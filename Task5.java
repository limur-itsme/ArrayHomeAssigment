import java.util.Scanner;
public class Task5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                int input = scanner.nextInt();
                if (input >= 0 && input <= 100) {
                    scores[i] = input;
                    break;
                }
                else {
                            System.out.println("Invalid score. Please enter a number between 0 and 100.");
                        }
                    }
                }

                int passed = 0;
                int failed = 0;
                int sum = 0;

                for (int score : scores) {
                    sum += score;
                    if (score >= 60) {
                        passed++;
                    } else {
                        failed++;
                    }
                }

                System.out.print("Scores:");
                for (int score : scores) {
                    System.out.print(" " + score);
                }
                System.out.println();

                double average = (double) sum / scores.length;

                System.out.println("Passed: " + passed);
                System.out.println("Failed: " + failed);
                System.out.println("Average: " + average);


    }
}
