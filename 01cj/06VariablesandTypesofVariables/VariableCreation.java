class  VariableCreation
{
	public static void main(String[] args) 
	{
		//primitive variable creation
		int p = 10;
		//m1(); method calling
		int q = m1(); //execute m1 method store returned value in q

		//referenced variable creation
		String s1 = "Hk";
		String s2 = new String("Srusti");
		System.out.println(s1);
		System.out.println(s2);

		Exampleusdd e1 = new Exampleusdd();
		System.out.println(e1.x);
		System.out.println(e1.y);
		System.out.println(e1);
		Exampleusdd e2 = m2();
		System.out.println(e2);

		System.out.println(p+" " +q);
		System.out.println(s1+" " +s2);
		System.out.println(e1+" " +e2);




	}
	//static void m1(){}
	//static int m1(){}   missing return statement
	static int m1(){
		return 50;
	}

	static Exampleusdd m2(){
		return new Exampleusdd();
	}
}
