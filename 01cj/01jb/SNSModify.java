class SNSModify{
	static int a = 10;
	int x = 20;
	int y = 30;
	
	public static void main(String[] args){
	System.out.println("main");

	A a1 = new A();
	A a2 = new A();
	A a3 = new A();

	System.out.println(a1.a);     System.out.println(a1.x);
	System.out.println(a2.a);     System.out.println(a2.x);
	System.out.println(a3.a);     System.out.println(a3.x);


	a1.a =55; a1.x= 65;
            
	System.out.println(a1.a);     System.out.println(a1.x);
	System.out.println(a2.a);     System.out.println(a2.x);
	System.out.println(a3.a);     System.out.println(a3.x);
	

	
	}
}