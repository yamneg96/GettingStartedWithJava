import java.util.Arrays;

public class MultiArray {
  /* MULTI-DIMENSIONAL ARRAY
   * This program demonstrates how to declare and initialize a multi-dimensional array.
   * Also to access each elements of a multi-dimensional array.
   */
  public static void main(String[] args) {

    int[][] a = {
        {1, -2, 3}, 
        {-4, -5, 6, 9}, 
        {7}, 
    };
  
    for (int i = 0; i < a.length; ++i) {
        for(int j = 0; j < a[i].length; ++j) {
            System.out.println(a[i][j]);
        }
    }
    // first for...each loop access the individual array
    // inside the 2d array
    for (int[] innerArray: a) {
        System.out.println(Arrays.toString(innerArray));
        // second for...each loop access each element inside the row
        for(int data: innerArray) {
            System.out.println(data);
        }
    }
}
}
