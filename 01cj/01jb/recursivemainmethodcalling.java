class A{
    public static void main(String[] args){
    System.out.println("A main");
     
     
    }
}

class B{
    public static void main(String[] args){
    System.out.println("B main");
    main(new String[0]);  //recursivemethodcalling
        
        //but we get runtime exception -stackoverflowexception
        //no compiletimeerror
        
        //we can call mainmethod by ourselves
        
        // jvm calls main method can we also call main method? 
     
     
    }
}