public class Methods {
  //The Topics below includes:
  //1. Method Overloading
  //2. Constructor Overloading
  //3. Constructor Chaining
  String language;
  int sum;

  // constructor with no parameter
  Methods() {
    this(5,2);//CONSTRUCTOR CALL MUST BE THE FIRST STATEMNET!
    this.language = "Java";
  }

  // constructor with a single parameter
  Methods(String language) {
    this.language = language;
  }

  Methods(int a, int b){
    //add two value
    this.sum = a + b;
  }

  public void getName() {
    System.out.println("Programming Language: " + this.language);
  }
  private static void display(int a){
      System.out.println("Arguments: " + a);
      System.out.println("Got Integer data.");
  }

  private static void display(int a, int b){
      System.out.println("Arguments: " + a + " and " + b);
  }

  // this method  accepts String object
  private static void display(String a){
    System.out.println("Got String object.");
  }
  private String formatNumber(int value) {
    return String.format("%d", value);
  }

  private String formatNumber(double value) {
    return String.format("%.3f", value);
  }

  private String formatNumber(String value) {
    return String.format("%.2f", Double.parseDouble(value));
  }
  public static void main(String[] args) {
      display(1);
      display(1, 4);
      display("Hello");

      Methods hs = new Methods();
      System.out.println(hs.formatNumber(500));
      System.out.println(hs.formatNumber(89.9934));
      System.out.println(hs.formatNumber("550"));

      Methods obj1 = new Methods();

      // call constructor with a single parameter
      Methods obj2 = new Methods("Python");

      obj1.getName();
      obj2.getName();
      /*
      * Important Points
  Two or more methods can have the same name inside 
  the same class if they accept different arguments. 
  This feature is known as method overloading.

  Method overloading is achieved by either:
  changing the number of arguments.
  or changing the data type of arguments.

  It is not method overloading if we only change 
  the return type of methods. There must be differences 
  in the number of parameters.
      */
    }
}
