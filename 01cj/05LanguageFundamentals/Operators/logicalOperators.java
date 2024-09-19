class logicalOperators{
    public static void main(String[] args) {
       //logical and (both conditions must be true)
       System.out.println((10>5)&&(2>1));//true
       System.out.println((10>5)&&(2<1));//false
       System.out.println((10<5)&&(2<1));//false
       
       //logical or (any 1 condition must be true)
       System.out.println((10>5)||(2>1));//true
       System.out.println((10>5)||(2<1));//true
       System.out.println((10<5)||(2<1));//false
       
       //logical not ()
       System.out.println(!(10>5));//true -false
       System.out.println(!(10<5));//false - true
       
       
       

    }
}