public class _08_EvenOrOdd {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    // Input a number from the user
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    // Check if the number is even or odd
    if (num % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  }
}
