class noException{
    public static void main(String[] args) {
        
        try{
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
            
        }catch(ArithmeticException e){
            System.out.println("Statement 4");  //if there is no exception or not raised at runtime catch block won't be executed
        }
        
        System.out.println("Statement 5");//normal abnormal terminnation
    }
}