class A{
    static void m1(){
        System.out.println(" A m1");
    }
    
    void m2(){
        System.out.println(" A m2");
    }
}

class B{

static void m1(){
        System.out.println(" B m1");
    }

    public static void main(String[] args){
        System.out.println("B main");
            A.m1();
            A a = new A();
            a.m2();
            B.m1();
            m1();
        
        
    
    }
    
}

//both has different scopes \boundaries\limits
