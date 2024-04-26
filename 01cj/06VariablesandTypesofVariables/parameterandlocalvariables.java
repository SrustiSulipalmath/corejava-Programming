class parameterandlocalvariables
{
	public static void main(String[] args) 
	{
		m1();
		m2(5);
		m3(6);
		m4(8);
		m5(10);//a,b,c
		m5(4);//a,b

		
	}
	static void m1(){
		int a = 10;
		System.out.println(a);
		
	}

	static void m2(int a){
		System.out.println(a);
	}
	static void m3(int a){
		int b = 20;
		int c = a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+" "+b+" "+c);
	}

	static void m4(final int a){
		int b = 10;
		int c = a+b;
		System.out.println(a+" "+b+" "+c);
		//a = 50;
		//System.out.println(a);
		
		
	}
	static void m5(int a){
		//System.out.println(b);   we cannot access
		int b =30;
		System.out.println(b);  //we can access

		if(a==10){
			int c = a+b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}


		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);

		//int d;
		//System.out.println(d); //you cannot access

		int d ; //you can declare
	}
}
