public class printStackTrace {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}

//e.printStackTrace();
//name of exception and description of exce and followed by Stack Trace
//complete information about exception

//Default Exception Handler uses this approach
//sopln internally contains print statements to print exception

//throwable class -> all methods
