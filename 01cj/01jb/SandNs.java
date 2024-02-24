class A{
	static int a = 10;
	int x = 20;
	
	public static void main(String[] args){
	System.out.println("main");

	A a1 = new A();
	A a2 = new A();
	A a3 = new A();

	System.out.println(a1.a);
	System.out.println(a2.a);
	System.out.println(a3.a);

	System.out.println(a1.x);
	System.out.println(a2.x);
	System.out.println(a3.x);
	
	}
}


	