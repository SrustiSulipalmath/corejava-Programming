class A{
    static void m1(){
        System.out.println(" A m1");
    }
    
    void m2(){
        System.out.println(" A m2");
    }
}

class B{

    public static void main(String[] args){
        System.out.println("B main");
            A.m1();
            A a = new A();
            a.m2();
        
        
        //inside b.class a.class is called
        //both classes are connected
        //nonstatic method - call by using class object
        //static method - call by using class name
        // to which class members you want to provide memory create object of that class
    
    }
    
}

