public class Test_2 
{
    public static void main(String[] args) throws InterruptedException
    {
        doStuff();
        
    }
    public static void doStuff()throws InterruptedException
    {
        doMoreStuff();
        
    }
    public static void doMoreStuff()throws InterruptedException{
        Thread.sleep(1000);
        
    }
 }

 //deligation
 //abnormal termination
 // all 3 throws must require 

 //throws keyword applicable for and methods
 //only for throwable type