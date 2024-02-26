class q{
    static void m2(){
        System.out.println("q m2");
    }
    
    static void m3(){
        System.out.println("q m3");
    }
    
    public static void main(String[] args){
        System.out.println("q main");
        m3();
        p.m1();
    }
}