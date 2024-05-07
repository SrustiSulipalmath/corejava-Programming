class  SandNs
{
	static int a = 10;
	int x = 20;

	static void m1(){
		System.out.println("static method m1");
		System.out.println(" a : "+a);
		//System.out.println(" x : "+x);
		System.out.println(" x : "+new SandNs().x); //explicitly call by creating object/explicitly screate object
	}

	void m2(){
		System.out.println("non static method m2");
		System.out.println(" a : "+a);
		System.out.println(" x : "+x);
	}
	public static void main(String[] args) 
	{
		m1();

		SandNs s = new SandNs();
		s.m2();
	}
}
