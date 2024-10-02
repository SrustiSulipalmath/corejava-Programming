public class Test_2 {
    public static void main(String[] args) {
        System.err.println(10/0);  //Arithmetic Exception, no compile time error,run time exception,unchecked Exception
    }
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at Test_3.main(Test_3.java:3)

//rarely occured exceptions are not checked by compiler ->unchecked Exception