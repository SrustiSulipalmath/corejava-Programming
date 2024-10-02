public class Test_2 {
    

public static void main(String[] args) {
        
    try{
        System.out.println("Statement 1");
        System.out.println(10/0);
        System.out.println("Statement 3");
        }catch(ArithmeticException e){  //exception may be raised in catch block
            System.out.println(10/2);
            
            System.out.println(10/0);  //it is outside try catch not part of try block hence it is always abnormal termination

        }
        System.out.println("Statement 5");

    }
}