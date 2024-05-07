class Sample 
{
	int m1 (){
		System.out.println("primitive return type");
		return 5;
	}

	double m2(){
		System.out.println("primitive return type");
		return 10.5;         //returning primitive value
	}

	int[] m3(){
		System.out.println("int array referened return type");
		return new int[5];    //returning object or object reference
	}

	Example m4(){
		System.out.println("Example class referenced return type");
		return new Example();
	}
	
}

class Example
{
}

class PrimrettypeandRefrettype
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();

		int x = s1.m1();
		System.out.println(x);

		double d = s1.m2();
		System.out.println(d);

		int[] ia = s1.m3();
		System.out.println(ia);

		Example e1 = s1.m4();
		System.out.println(e1);


		
	}

}
