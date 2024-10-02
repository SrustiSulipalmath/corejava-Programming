public class Test_1 {

        public static void main(String[] args) {
            try{
                System.out.println("Statement 1");
                System.out.println(10/0);   //program will be stopped by raising that exception
                System.out.println("Statement 3");
                
            }catch(NullPointerException e){    //exception raised and corresponding catch block not matched
                System.out.println("Statement 4"); 
            }
            System.out.println("Statement 5"); //abnormal termination
        }
    }

    /*Statement 1
         Exception in thread "main" java.lang.ArithmeticException: / by zero
         at Test_1.main(Test_1.java:6) */
