
public class _05_swap {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    // Swapping
    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("After swapping:");
    System.out.println("First number: " + num1);
    System.out.println("Second number: " + num2);
  }
}
