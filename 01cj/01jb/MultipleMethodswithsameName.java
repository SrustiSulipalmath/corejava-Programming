class MultipleMethodswithsameName{
static void m1(){        //m1 method with no parameter
    System.out.println("m1 no-parameter");
}

static void m1(int a){   //m1 method with int parameter    | int - parameter
    System.out.println("m2 int-parameter");
}
    
static void m1(String s){
    System.out.println("m1 String-parameter");
}

public static void main(String[] args){
    System.out.println("main");
     m1();   //M1 WITHOUT ARGUMENT
     m1(5);  //5-argument
     m1("SRUSTI")
}
    
}

//error : method m1 is already defined
//method is only executed when it is called from main method
//if multiple methods are defined then the order of execution is the order we call