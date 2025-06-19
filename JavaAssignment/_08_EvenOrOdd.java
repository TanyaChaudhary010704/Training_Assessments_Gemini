public class _08_EvenOrOdd {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    if (num % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  }
}
