package importable.sample2;
import importable.sample.Import1;
public class Import2{
   
  public static void main(String... args){
    String name = "yim";
    Import1 m1 = new Import1();
    System.out.println(m1.name);
    System.out.println(name);
  }
}