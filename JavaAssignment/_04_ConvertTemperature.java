
public class _04_ConvertTemperature {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    // Input temperature in Celsius from the user
    System.out.print("Enter temperature in Celsius: ");
    double celsius = scanner.nextDouble();
    // Convert Celsius to Fahrenheit
    double fahrenheit = (celsius * 9 / 5) + 32;
    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
  }
}
