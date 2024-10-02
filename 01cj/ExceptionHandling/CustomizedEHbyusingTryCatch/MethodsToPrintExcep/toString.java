public class toString {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e.toString());
            System.out.println(e);
        }
    }
}

//System.out.println(e);
//System.out.println(e.toString()));
//only name of exception and description of exce