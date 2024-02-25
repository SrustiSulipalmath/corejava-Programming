class A{
    static void m1(Example e){
        System.out.println(" A m1");
    }
    
    void m2(Employee e){
    System.out.println(" A m2");
    
    }
    
public static void main(String[] args){
        System.out.println("A main");
    
}
}

class Example{
    
}

class Employee{
    
}
   


class B{
    
   
    
 public static void main(String[] args){
        System.out.println("B main");
     
     A.m1(new Example());
     C.m1(new C());
     
     A a1 = new A();
      a1.m2(new Employee());
     
     //Example i = new Example();
     //creating of object for example (either object or variable must be created)
     
     
 }
    
    
}

class C{
    static void m1(C c){
        System.out.println(" C m1");
    }
    
public static void main(String[] args){
        System.out.println("C main");
    
}
}
