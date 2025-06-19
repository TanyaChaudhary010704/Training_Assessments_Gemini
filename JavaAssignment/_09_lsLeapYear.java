public class _09_lsLeapYear {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    // Input year
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();
    // Check if the year is a leap year
    // A year is a leap year if it is divisible by 4, but not divisible by 100,
    // unless it is also divisible by 400.
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
}
