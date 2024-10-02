public class trywithmultiplecatchblock {
    public static void main(String[] args) {
    
        // try{
        //     System.out.println(10/0);
        // }
        // // catch(Exception e){
        // //     System.out.println("Exception");
        // // }Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
        // catch(ArithmeticException  e1){
        //     System.out.println("ArithmaticException");
        // }

        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException  e){
            System.out.println("ArithmaticException");
        }
        catch(Exception e){
             System.out.println("Exception");
         }  //both are reachable and valid
    }
}
//catch blocks from top to bottom
//catch block parent exception can handle it's child exception
//order of catch block child to parent
