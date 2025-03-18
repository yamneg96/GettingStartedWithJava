import java.util.Scanner;

/* A leap year is exactly divisible by 4
exept for century years (years ending with 00)
The century year is a leap year only if it is perfectly divisible by 400.
 */

public class leapYear {
    public static String checkLeapYear(int year) {
      if (year % 4 == 0 && year % 100 != 0) {
          String result = "It's a leap year";
          return result;
      } else if (year % 400 == 0 && year % 100 == 0) {
          String result = "It's a leap year";
          return result;
      } else {
          String result = "It's not a leap year";
          return result;
      }
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int year = input.nextInt();
      String result = checkLeapYear(year);
      System.out.println(result);
      input.close();
  }
}
