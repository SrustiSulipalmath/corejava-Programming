class A{
    public static void main(String[] args){
    System.out.println("A main");
     
     
    }
}

class B{
    public static void main(String[] args){
    System.out.println("B main");
    A.main(new String[5]);
     
     
    }
}


//syntax for calling main method - classname.main(String[size(0/+ve integer)])

// class object creation-()
//array object creation-[]
//jvm will create memory hence if wrong size is given there is no compiletimeerror it is verified during execution hence jvm will throw error because it cannot create memory
