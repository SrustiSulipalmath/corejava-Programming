class p{
    static void m1(){
        System.out.println("p m1");
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
//if you want to access a class from different file within the scope then java file name and class name must be same