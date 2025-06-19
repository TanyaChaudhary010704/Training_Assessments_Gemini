
public class _03_circle {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    // Input radius of the circle
    System.out.print("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();
    // Calculate area
    double area = Math.PI * Math.pow(radius, 2);
    // Calculate circumference
    double circumference = 2 * Math.PI * radius;

    System.out.println("Area of the circle: " + area);
    System.out.println("Circumference of the circle: " + circumference);
  }
}
