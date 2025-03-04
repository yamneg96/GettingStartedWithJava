import java.util.Scanner;

public class FirsNSum {
      public static int calculateNaturalSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result = calculateNaturalSum(n);
        System.out.print(result);
        input.close();
    }
}
