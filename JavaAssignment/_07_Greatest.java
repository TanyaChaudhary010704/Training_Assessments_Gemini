
public class _07_Greatest {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    // Input three numbers from the user
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    System.out.print("Enter third number: ");
    int num3 = scanner.nextInt();

    int greatest = num1;
    // Compare the numbers to find the greatest
    if (num2 > greatest) {
      greatest = num2;
    }
    if (num3 > greatest) {
      greatest = num3;
    }

    System.out.println("Greatest number: " + greatest);
  }
}
