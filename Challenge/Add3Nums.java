import java.util.Scanner;

public class Add3Nums {

    public static int calculateSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int result = calculateSum(num1, num2, num3);
        System.out.print(result);
        input.close();
    }
}

