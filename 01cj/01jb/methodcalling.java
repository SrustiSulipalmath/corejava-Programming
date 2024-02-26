class A{
    
}


class B{
    static void m1(){
        System.out.println("B m1");
    }
}


class C{
    static void m2(){
        System.out.println("C m2");
    }
    
    static void m3(){
        System.out.println("C m3");
    }
    
    public static void main(String[] args){
        System.out.println("C main");
        m3();
    }
}


class D{
    static void m4(){
        System.out.println("D m4");
    }
}


class E{
    static void m5(){
        System.out.println("E m3");
    }
    
    static void m6(){
        System.out.println("E m6");
    }
    
    public static void main(String[] args){
        System.out.println("E main");
        m5();
        B.m1();
        C.m2();
        C.m3();
        C.main(new String[0]);
        D.m4();
        E.m6();
        
    }
}


//multiple classes hence we can save java file with any class name