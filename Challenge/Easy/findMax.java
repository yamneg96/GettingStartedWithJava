import java.util.Scanner;

public class findMax {
      public static int findLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 Numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int result = findLargest(n1, n2);
        System.out.print(result);
        input.close();
    }
}
