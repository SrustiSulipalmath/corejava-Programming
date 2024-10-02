public class Test_4 {
    public static void main(String[] args) {
        
        try{
            System.out.println("Statement 1");
            System.out.println(10/0);
            System.out.println("Statement 3");
            }catch(ArithmeticException e){  //exception may be raised in catch block
                System.out.println(10/2);
                try{
                    System.out.println(10/0);
                }catch(ArithmeticException e1){
                    System.out.println(10/2);
                }
                
                  
    
            }
            System.out.println("Statement 5");
    
        }
}
