public class Test_2 {
    public static void main(String[] args) {
        try{
            System.out.println("outer try block");

            try{
                System.out.println("inner try block");
                System.out.println(10/0);
            }catch(NullPointerException e){
                System.out.println("inner catch block");

            }
            System.out.println("outside of inner try-catch");
        }catch(NegativeArraySizeException e){
            System.out.println("outer catch block");

        }
        finally{
            System.out.println("outer finally block");

        }
    }
}
