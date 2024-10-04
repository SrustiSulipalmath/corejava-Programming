public class StackOverflowError {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
}


//when recursion is called  (recursive method call)->cycle never ends
//no compiletime error