class ParameterizedandNPmethods 
{
	static void m1(){
		System.out.println("m1");
	}
	static void m2(int x){
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		m1();
		//m2();
		//m1(5);
		m2(5);
		m2('a');

		//byte short char and int data type values or arguments are allowed
	}
}
