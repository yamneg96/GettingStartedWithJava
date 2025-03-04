import java.util.Scanner;

public class Add10 {
  public static int calculateSum(int number) {
    number += 10;
    return number;
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Number = ");
      int num = input.nextInt();
      int resultNum = calculateSum(num);
      System.out.print(resultNum);
  }
}
