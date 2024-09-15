class cload 
{
	static int a = m1();
	static int m1(){
		System.out.println("SV:a");
		return 10;
	}
	static{
		System.out.println("sb");
	}
		
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	static void m2(){
		System.out.println("sm");
	}

	 int x = m3();
	 int m3(){
		System.out.println("NSV:x");
		return 10;
	}
	{
		System.out.println("nsb");
	}
		
	cload() 
	{
		System.out.println("constructor");
	}
	void m4(){
		System.out.println("nsm");
	}
}
