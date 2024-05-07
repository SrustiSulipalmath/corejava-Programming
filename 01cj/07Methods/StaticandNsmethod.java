class Methods 
{
	static void m1(){
		System.out.println("static method m1");
	}

	void m2(){
		System.out.println("non static method m2");
	}
	
}

class StaticandNsmethod
{
	public static void main(String[] args) 
	{
		//m1();
		//m2(); 

		Methods.m1();
		//Methds.m2();

		Methods m = new Methods();
		m.m2();
		m.m1();
	}
}
