class  VoidandNonvoidmethod
{
	static void m1(){
		System.out.println("void m1");
		return;
	}
	static int m2(){
		System.out.println("non void m2");
		return 5;
	}
	
	public static void main(String[] args) 
	{
		m1();
		m2();
		//int x = m1();
		int y = m2();
		//System.out.println(m1());
		System.out.println(m2());
		//int a = 10 + m1();
		int b = 10 + m2();
		
	}
}
