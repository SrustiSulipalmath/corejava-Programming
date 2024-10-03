public class Case_2 {
    public static void main(String[] args) {
        // System.out.println(10/0);
        // System.out.println("Hello");(RunTimeException)

        throw new ArithmeticException();//compile time error
       // System.out.println("Hello");  //Unreachable code 
       //compiler knows at this line exception is going to occur and hence rest of the code will not be executed
    }
}


// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Case_2.main(Case_2.java:3)
