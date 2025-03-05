import java.util.Scanner;

public class switchCaclulator {
  public static double basicCalculator(double num1, char op, double num2) {
    double sum;
    switch (op) {
        case '+':
            sum = num1 + num2;
            return sum;
      case '-':
            sum = num1 - num2;
            return sum;
        case '*':
            sum = num1 * num2;
            return sum;
        case '/':
            sum = num1 / num2;
            return sum;
        default:
            System.out.print("Invalid Operator Symbol!");
            return 0;
    }
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("num1: ");
    double num1 = input.nextInt();
    System.out.print("Enter Operator Symbol: ");
    char op = input.next().charAt(0);
    System.out.print("num2: ");
    double num2 = input.nextInt();
    double result = basicCalculator(num1, op, num2);
    System.out.print(result);
    input.close();
}
}
