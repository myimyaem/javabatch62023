import java.util.Random;
   
public class Main {
  public static void main(String[] marco) {
    Random r = new Random();
    System.out.println("the random generated number is: "+r.nextInt(50));
    String name = "marco"; //variable
    greetName(name); //use greetName method
    greetName("Grace");
  }
  // method sample
 public static void greetName(String name){
   System.out.println("Hello "+name);
  
  }
}

class Drinks{
  
}
class Snack{
  
}