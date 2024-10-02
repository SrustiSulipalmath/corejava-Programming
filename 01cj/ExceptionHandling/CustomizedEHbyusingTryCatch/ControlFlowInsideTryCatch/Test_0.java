public class Test_0 {
    public static void main(String[] args) {
        try{
            System.out.println("Statement 1");
            System.out.println(10/0);
            System.out.println("Statement 3");
            
        }catch(ArithmeticException e){    //exception raised and corresponding catch block matched
            System.out.println("Statement 4"); 
        }
        System.out.println("Statement 5"); //normal termination
    }
}


/*
   Statement 1
   Statement 4
   Statement 5
 */


//first alternative code/flow will be executed and control will never go to try block again even after the exception is handled properly 
//then main flow/code will be executed, rest of the try block will never be executed hence only risk code but not normal code 
//should be written in try block length of the try block should be as less as possible
