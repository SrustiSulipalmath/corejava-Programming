public class ClassCastException {
    public static void main(String[] args) {
        String s = new String("Srusti");
        Object o =(Object)s;
        System.out.println(o);

        Object o1 =new Object();
        //String s1 = (Object)o1
        System.out.println(o1);

        Object o2 =new String("Srusti");  //parent reference child object
        String s2 = (String)o;
        System.out.println(s2);
    }
}

//while performing typecasting
//child object can be easily typecasted to its parent type
//but parent cannot be typecasted to child type
