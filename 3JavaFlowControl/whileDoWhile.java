import java.util.Scanner;

public class whileDoWhile {
   public static void main(String[] args) {
      
    int sum1 = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);
	   
    // do...while loop continues 
    // until entered number is positive
    System.out.println("Do While Loop.");
    int number = 0;
    do {
      // add only positive numbers
      System.out.println("Enter a number");
      number = input.nextInt();
      sum1 += number;
    } while(number >= 0); 
	   
    System.out.println("Sum1 = " + sum1);
    int sum2 = 0;
    int number2 = 0;
    System.out.println("While Loop.");
    while (number2 >= 0) {
      // add only positive numbers
      sum2 += number2;

      System.out.println("Enter a number");
      number2 = input.nextInt();
    }
	   
    System.out.println("Sum2 = " + sum2);
    input.close();
  }
}
