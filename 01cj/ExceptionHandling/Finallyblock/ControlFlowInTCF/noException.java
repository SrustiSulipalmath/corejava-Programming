public class noException {
    public static void main(String[] args) {
     try{
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
     }catch(Exception e){
        System.out.println("statement 4");
            
     }finally{
        System.out.println("statement 5");
     }
            System.out.println("statement 6");
    }
    
}