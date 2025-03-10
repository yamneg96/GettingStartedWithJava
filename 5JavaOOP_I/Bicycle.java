
public class Bicycle{
  //Members of a class are: fields and methods.
  //state or field
  private int gear = 5;

  //behavior or method
  public void breaking(){
    System.out.println("working of Braking");
  }

  public static void main(String[] args){
    Bicycle sportsBicycle = new Bicycle();
    int gear = sportsBicycle.gear;
    System.out.println(gear);
    sportsBicycle.breaking();
  //Class object = new className();  
  //After new we are using the constructor.
  }
}
