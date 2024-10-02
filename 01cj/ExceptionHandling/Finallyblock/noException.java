//place where code should execute whether exception raised/occured/handled or not is called finally block
//resource deallocation code

public class noException{
    public static void main(String[] args) {
        try{
            System.out.println("try");
        }
        catch(Exception e){
            System.out.println("catch");
        }
        finally{
            System.out.println("finally");
        }
    }
}



