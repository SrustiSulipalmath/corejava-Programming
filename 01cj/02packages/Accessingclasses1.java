class Accessingclasses1{
    
    
    //if two classes belongs the either default package or belongs to same package for accessing one class from other class we no need to use fqn or we no need to use import //statement we can directly acess this class by using its name
    
    
    class A{
        static void m1(){
            System.out.println("A m1");
        }
        
         void m2(){
            System.out.println("A m2");
        }
    }
    
    
    class Test{
    
    public static void main(String[] args){
        
        A.m1();
        A a1 =new A();
        a1.m2();    
        
    }
}
}