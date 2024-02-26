class A {
        public static void main(int[] args){
        System.out.println("A main( (int[])");
    }
        
        public static void main(String[] args){
        System.out.println("A main (String[])");
            main(new int[0]);
            main("Srusti");
    }
        
        public static void main(String args){
        System.out.println("A main (String)");
        
        }
}

//class B {
  //  public static void main(String[] args){
    //    System.out.println("B main");
      //  A.main(new String[0]);
        //A.main(args);  //same name is passed
       // }
//}


// we cannot call same main method more than once
//we can overload main method