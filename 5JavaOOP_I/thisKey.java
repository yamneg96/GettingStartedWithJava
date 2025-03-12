public class thisKey {
  int instVar;

    thisKey(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        thisKey obj = new thisKey(8);
        System.out.println("object reference = " + obj);
    }
}

/*
 * In Java, this keyword is used to refer to 
 * the current object inside a method or a constructor. 
 * And it is used for the following purposes:
 * 1. for Ambiguity Variable Names
 * Eg. class MyClass {
    // instance variable
    int age;

    // parameter
    MyClass(int age){
        age = age;
    }
}
  * 2. to call a constructor from another constructor
  Eg. class Complex {

    private int a, b;

    // constructor with 2 parameters
    private Complex( int i, int j ){
        this.a = i;
        this.b = j;
    }

    // constructor with single parameter
    private Complex(int i){
        // invokes the constructor with 2 parameters
        this(i, i); 
    }

    // constructor with no parameter
    private Complex(){
        // invokes the constructor with single parameter
        this(0);
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }
}
    3. with Getters and Setters
    Eg. class Main {
   String name;

   // setter method
   void setName( String name ) {
       this.name = name;
   }

   // getter method
   String getName(){
       return this.name;
}}
  4. Passing this as an Argument
  Eg. 
 */