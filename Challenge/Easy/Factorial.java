import java.util.Scanner;

public class Factorial {
      public static int calculateFactorial(int num) {
        int result = 1;
        while (num > 0) {
            int num2 = 1;
            if (num >= 1) {
                num2 = num - 1;
            }
            result = num * num2;
            --num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        int result = calculateFactorial(n);
        System.out.print(result);
        input.close();
    }
}
