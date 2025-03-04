public class Literals {
  public static void main(String[] args) {
    // Integer Literals
    int myInt = 100;
    System.out.println(myInt); // Output: 100

    // Floating Point Literals
    double myDouble = 3.14;
    System.out.println(myDouble); // Output: 3.14

    // Character Literals
    char myChar = 'A';
    System.out.println(myChar); // Output: A
    char myUnicodeChar = '\u0041';
    System.out.println(myUnicodeChar); // Output: A
    char sth = '\b';
    System.out.println(sth); // Output: Backspace
    sth = '\t';
    System.out.println(sth); // Output: Tab
    sth = '\n';
    System.out.println(sth); // Output: New Line
    sth = '\f'; // Form Feed
    System.out.println(sth); // Output: Form Feed
    sth = '\u0000'; // Null
    System.out.println(sth); // Output: Null
    sth = '\uffff'; // Not a character
    System.out.println(sth); // Output: Not a character

    // String Literals
    String myString = "Hello, World!";
    System.out.println(myString); // Output: Hello, World!

    // Boolean Literals
    boolean myBool = (5 != 3);
    System.out.println(myBool); // Output: true
  }
}
