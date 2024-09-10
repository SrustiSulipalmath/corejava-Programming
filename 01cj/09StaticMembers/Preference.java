class Preference 
{
	static int a;

	static{
		System.out.println("Static block 1 start");
		a=10;
		System.out.println(a);
		System.out.println("Static block 1 end");
	}

	static{
		System.out.println("Static block 2 start");
		a=20;
		System.out.println(a);
		System.out.println("Static block 2 end");
	}

	
	public static void main(String[] args) 
	{
		System.out.println("Main start");
		int a = 50;
		System.out.println(a);
		System.out.println("Main end");
		m1();

		
	}

	static void m1(){
		int a = 60;
		System.out.println("m1 start");
		System.out.println(a);
		System.out.println("m1 end");
	}
}
