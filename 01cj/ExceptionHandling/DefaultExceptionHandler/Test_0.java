public class Test_0{
 public static void main(String[] args) {
    
   
    dostuff();
 }    
 public static void dostuff(){
    domorestuff();
}
public static void domorestuff(){
    System.out.println("Hello");
    System.out.println(10/0);
}   //method in which exception is raised it is respomsible for creating exception object
}


//Exception stack trace:
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at Test.domorestuff(Test.java:12)
//at Test.dostuff(Test.java:8)
//at Test.main(Test.java:5)