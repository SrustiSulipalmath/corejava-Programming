public class ExceRaisCorrCatcBNotMat {
    public static void main(String[] args) {
            try{
                   System.out.println("statement 1");
                   System.out.println(10/0);
                   System.out.println("statement 3");
            }catch(NullPointerException e){
               System.out.println("statement 4");
                   
            }finally{
               System.out.println("statement 5");  //abnormal termination
            }
            System.out.println("statement 6");
           
    }
}
