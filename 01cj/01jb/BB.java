
// DEVELOP A PROGRAM TO SHOW NON STATIC MEMBERS

class B{
    int b =10;

    void m1(){
	System.out.println("m1");   
	}
	public static void main(String[] args){
	 System.out.println("main");
	 
	 B b1 = new B();
	 B b2 = new B();
	 B b3 = new B();

	 System.out.println(b1.b);
	 b1.m1();

	 System.out.println(b2.b);
	 b2.m1();

	 System.out.println(b3.b);
	 b3.m1();
   
	}
}