import java.util.Scanner;

public class arrayAvg {
      public static double calculateAverage(int[] arr, int arrSize) {
        arrSize = arr.length;
        double sum = 0;
        for (int i = 0; i < arrSize; i++) {
            sum += arr[i];
        }
        double Avg = sum / arrSize;
        return Avg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array Size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        double result = calculateAverage(array, size);
        System.out.println(result);
        input.close();
    }
}
