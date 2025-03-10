import java.util.Arrays;

public class copyArray {
  public static void main(String[] args) {
       
    int [] numbers = {1, 2, 3, 4, 5, 6};
    int [] positiveNumbers = numbers;    // copying arrays using the assignment operator.

    for (int number: positiveNumbers) {
        System.out.print(number + ", ");
    }
    //USING FOR LOOP.
        int [] source = {1, 2, 3, 4, 5, 6};
    int [] destination = new int[6];

    // iterate and copy elements from source to destination
    for (int i = 0; i < source.length; ++i) {
        destination[i] = source[i];
    }
  
      // converting array to string
    System.out.println(Arrays.toString(destination));

    /* COPYARRAY() METHOD => ``` System.arraycopy() ```
     * The arraycopy() method allows you to copy 
     * a specified portion of the source array to the destination array. For example,

    arraycopy(Object src, int srcPos,Object dest, int destPos, int length)
    Here,

    src - source array you want to copy
    srcPos - starting position (index) in the source array
    dest - destination array where elements will be copied from the source
    destPos - starting position (index) in the destination array
    length - number of elements to copy
     */
    int[] n1 = {2, 3, 12, 4, 12, -2};
      
    int[] n3 = new int[5];

    // Creating n2 array of having length of n1 array
    int[] n2 = new int[n1.length];
  
    // copying entire n1 array to n2
    System.arraycopy(n1, 0, n2, 0, n1.length);
    System.out.println("n2 = " + Arrays.toString(n2));  
  
    // copying elements from index 2 on n1 array
    // copying element to index 1 of n3 array
    // 2 elements will be copied
    System.arraycopy(n1, 2, n3, 1, 2);
    System.out.println("n3 = " + Arrays.toString(n3));
    //COPYOFRANGE() METHOD      
        int[] source2 = {2, 3, 12, 4, 12, -2};
      
        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source2, 0, source2.length);      
        System.out.println("destination1 = " + Arrays.toString(destination1)); 
      
        // copying from index 2 to 5 (5 is not included) 
        int[] destination2 = Arrays.copyOfRange(source2, 2, 5); 
        System.out.println("destination2 = " + Arrays.toString(destination2));
}
}
