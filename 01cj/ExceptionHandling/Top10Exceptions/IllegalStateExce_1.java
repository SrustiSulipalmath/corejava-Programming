import java.util.*;
 class IllegalStateExce_1 {
public static void main(String[] args) {
    ArrayList<String> l = new ArrayList<String>();
    l.add("A");
    l.add("B");
    l.add("C");
    Iterator itr = l.iterator();
    while(itr.hasNext()){
       // System.out.println(itr.next());
        //Object obj = itr.next();
       itr.remove();
    }
    System.out.println(l);
}
}

//calling remove method at wrong time
//calling a method at wrong time

// Exception in thread "main" java.lang.IllegalStateException
//         at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:1063)
//         at IllegalStateExce_1.main(IllegalStateExce_1.java:12)
