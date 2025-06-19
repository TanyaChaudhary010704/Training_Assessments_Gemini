public class _10_Grade {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Read marks for 5 subjects from the user and sum them up
    System.out.print("Enter your marks: ");
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
      System.out.print("Enter marks for subject " + i + ": ");
      sum += scanner.nextInt();
    }
    double marks = (sum / 5.0);

    // Calculate and display the grade based on the marks
    if (marks >= 90) {
      System.out.println("Grade: A");
    } else if (marks >= 80) {
      System.out.println("Grade: B");
    } else if (marks >= 70) {
      System.out.println("Grade: C");
    } else if (marks >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }
  }
}
