//Super Class
public class Methods2{
    // constructor of the superclass
    Methods2(int version1, int version2) {

      if (version1 > version2) {
        System.out.println("The latest version is: " + version1);
      }
  
      else {
        System.out.println("The latest version is: " + version2);
      }
  
    }
    public static void main(String[] args) {
  
      // call the first constructor
      Main obj = new Main();
    }
  }
  
  // child class
  class Main extends Methods2 {
  
    // constructor of the child class
    Main() {
      // calling the constructor of super class
      super(11, 8);
    }
}
