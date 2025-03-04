public class bitWise {
  //Bitwise operators are used to perform manipulation of individual bits of a number.
  public static void main(String[] args) {
    int a = 5; // 101
    int b = 7; // 111
    System.out.println("a & b = " + (a & b)); // 101 & 111 = 101 = 5
    // & is a bitwise AND operator. It performs bitwise AND of two bits.
    System.out.println("a | b = " + (a | b)); // 101 | 111 = 111 = 7
    // | is a bitwise OR operator. It performs bitwise OR of two bits.
    System.out.println("a ^ b = " + (a ^ b)); // 101 ^ 111 = 010 = 2
    // ^ is a bitwise XOR operator. It performs bitwise XOR of two bits.
    System.out.println("~a = " + ~a); // ~101 = 010 = 2
    // ~ is a bitwise compliment operator. It is a unary operator and flips the bits of the number.
    System.out.println("a << 1 = " + (a << 1)); // 101 << 1 = 1010 = 10
    // << is a left shift operator. It shifts the bits of the number to the left by the number of positions specified.
    System.out.println("a >> 1 = " + (a >> 1)); // 101 >> 1 = 10 = 2
    // >> is a right shift operator. It shifts the bits of the number to the right by the number of positions specified.
    System.out.println("a >>> 1 = " + (a >>> 1)); // 101 >>> 1 = 10 = 2
    // >>> is a right shift operator. It shifts the bits of the number to the right by the number of positions specified. The difference between >> and >>> is that the >> operator preserves the sign bit, whereas the >>> operator does not.
  }
}
