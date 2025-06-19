import java.util.Scanner;

public class _02_siAndCi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter principal amount: ");
    // Input principal amount from the user
    double principal = scanner.nextDouble();
    System.out.print("Enter rate of interest (in %): ");
    // Input rate of interest from the user
    double rate = scanner.nextDouble();
    System.out.print("Enter time (in years): ");
    // Input time period from the user
    double time = scanner.nextDouble();
    // Calculate Simple Interest
    double simpleInterest = (principal * rate * time) / 100;

    // Calculate Compound Interest
    double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

    System.out.println("Simple Interest: " + simpleInterest);
    System.out.println("Compound Interest: " + compoundInterest);
  }
}
