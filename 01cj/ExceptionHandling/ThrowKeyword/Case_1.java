public class Case_1 {
    static ArithmeticException e = new ArithmeticException();  //created object
    static ArithmeticException e1;
    public static void main(String[] args) {
        
        throw e1;
        // throw e;

        
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "Case_1.e1" is null
//         at Case_1.main(Case_1.java:6)

// Exception in thread "main" java.lang.ArithmeticException
//         at Case_1.<clinit>(Case_1.java:2)