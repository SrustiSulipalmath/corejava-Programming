public class Test_1 {

        public static void main(String[] args) {  //caller method
           
          
           dostuff();
        }    
        public static void dostuff(){   //caller method
           domorestuff();
           System.out.println(10/0);  //Abnormal Termination
       }
       public static void domorestuff(){
           System.out.println("Hello");  //Normal Termination
           
       }  
}

//Default exception handler - prints exception name and its description and terminates program abruptly ->jvm assistant
