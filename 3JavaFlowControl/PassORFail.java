import java.util.Scanner;
public class PassORFail {    
    public static String checkScore(double score) {
        if (score >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
//This is a challenge from PROGRAMMIZ. The task is to write a program that takes a score as input and returns Pass if the score is greater than or equal to 50, otherwise it should return Fail.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        double score = input.nextDouble();
        String result = checkScore(score);
        System.out.println(result);
        input.close();
    }
}
