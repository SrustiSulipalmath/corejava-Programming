class StaticNS{
    static int b =10;                              //b is avaible in StaticNS class object


    void m1(){
	System.out.println("m1");   
	}
	public static void main(String[] args){
	 System.out.println("main");
	 System.out.println(b);			  //access directly by using its name
	 
	StaticNS b1 = new StaticNS();
	StaticNS b2 = new StaticNS();
	StaticNS b3 = new StaticNS();

	 System.out.println(b1.b);               //execute b variable from b1 pointing object
	 b1.m1();                         
	 System.out.println(b2.b);		 //access by using class object
	 b2.m1();

	 System.out.println(b3.b);
	 b3.m1();
	 
	 System.out.println(StaticNS.b);        //access by using class name
   
	}
}