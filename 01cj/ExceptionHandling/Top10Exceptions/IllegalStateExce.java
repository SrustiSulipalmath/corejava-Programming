public class IllegalStateExce {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        t.start();  //illegal thread state exception
    }
}
//calling a method at wrong time

//Exception in thread "main" java.lang.IllegalThreadStateException
// at java.base/java.lang.Thread.start(Thread.java:1517)
// at IllegalStateExce.main(IllegalStateExce.java:5)

