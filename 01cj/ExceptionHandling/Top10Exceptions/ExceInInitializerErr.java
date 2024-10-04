public class ExceInInitializerErr {
    static int x = 10/0;
    public static void main(String[] args) {
        
    }
}
//while performing static variable initialization
//static block execution


// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at ExceInInitializerErr.<clinit>(ExceInInitializerErr.java:2)