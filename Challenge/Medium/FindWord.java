import java.util.Scanner;
public class FindWord {

  public static String censorWord(String sentence, String word){
    return sentence.replaceAll(word, "*".repeat(word.length()));//NOT MINE.
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
  }
}
