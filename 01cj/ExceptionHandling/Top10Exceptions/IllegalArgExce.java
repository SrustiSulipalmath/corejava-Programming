public class IllegalArgExce {
    public static void main(String[] args) {
        Thread t = new Thread();//value for thread priority
        t.setPriority(10);
        t.setPriority(100);
    }
}

//inappropriate 
//a method is called with illegal argument

//Exception in thread "main" java.lang.IllegalArgumentException
// at java.base/java.lang.Thread.setPriority(Thread.java:1823)
// at IllegalArgExce.main(IllegalArgExce.java:5)
