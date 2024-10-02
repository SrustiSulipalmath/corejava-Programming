class Test_0{
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(10/2);
        }
        
        System.out.println("Statement 3");
    }
}//normal,graceful termination



/**   class Test_0{
*     public static void main(String[] args) {
*       System.out.println("Statement 1");
*        System.out.println(10/0);  the code which may rise an exception is called risky code
*                                   we have to take it inside try block corresponding handlind code inside catch block
*        System.out.println("Statement 1");
*     }
}*/

//Statement 1
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at Test_0.main(Test_0.java:4)

//abnormal termination,nongraceful termination

/*
 * try{
 * 
 * }catch(){
 * 
 * }
 */