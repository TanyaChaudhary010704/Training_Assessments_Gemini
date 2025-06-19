import java.util.Scanner;

public class _01_sumAndPercentage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int subjects = 5;
    int[] marks = new int[subjects];
    int sum = 0;

    System.out.println("Enter marks for 5 subjects:");
    for (int i = 0; i < subjects; i++) {
      System.out.print("Subject " + (i + 1) + ": ");
      marks[i] = scanner.nextInt();
      sum += marks[i];
    }

    double percentage = (sum / (subjects * 100.0)) * 100;

    System.out.println("Sum of marks: " + sum);
    System.out.println("Percentage: " + percentage + "%");

    scanner.close();
  }
}