public class Test_2 {
    public static void main(String[] args) {  //caller method
           
        dostuff();
        System.out.println(10/0);  //Abnormal Termination
     }    
     public static void dostuff(){   
        domorestuff();
        System.out.println("Hi");  //Normal Termination
    }
    public static void domorestuff(){
        System.out.println("Hello");  //Normal Termination
        
    }  
}