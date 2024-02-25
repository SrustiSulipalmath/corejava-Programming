class MultipleMethods{
static void m1(){
    System.out.println("m1");
}

public static void main(String[] args){
    System.out.println("main");
     m1();
}
    
}


// we get error(compile time error) only when we call the method(defined as non static method) from main method

//we don't get error just by defining method as non static method