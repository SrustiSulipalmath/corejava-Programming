class CharTest 
{
	public static void main(String[] args) 
	{
		Example.m1(1);
		Example.m1('1');
		//Example.m1(a);
		Example.m1(97);
		Example.m1('a');
	}
}

class Example
{

	static void m1(int a){
		System.out.println("int-param");
	}
	static void m1(char ch){
		System.out.println("char-param");
	}

}
