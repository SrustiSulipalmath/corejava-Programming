public class systemExit {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            //System.exit(0);
            System.exit(-10);
        }
        catch(Exception e){
            System.out.println("catch");
        }
        finally{
            System.out.println("finally");
        }
        
    }
}
//if jvm is exited explicitly if you shutdown jvm explicitly then finally will not be executed
//System.exit(0) dominates finally block

//0 normal Termination
//1(non zero) abnormal Termination    status code ->argument