class DefaultDatatype{
	public static void main(String[] args) 
	{


		m1(5);//m1(int)

		//approach 1 : variable assignment
		byte b1 = 5;
		short s1 =5;
		long l1 =5;
		m1(b1);
		m1(s1);
		m1(l1);

		//approach 2 : by using type casting
		m1((byte)5); // 5 is int it is getting converted to byte
		m1((short)5);
		m1((long)5);

		//approach 3 : by using suffix character
		m1(5L); // 5 itself is long because of suffix
		//System.out.println(12345678901L);
		System.out.println(12345678901L);

		//int i1=12345678901;
		//long l1=12345678901;
		long l2=12345678901L;
		System.out.println(l2);

		System.out.println(10L);
		System.out.println(10l);

		//long l3= (long)12345678901;  number is only invalid
		long l3= (long)12345678901L;


}
		//overloading method

		static void m1(byte b){
		System.out.println("byte param!");  //parameter
		}

		static void m1(short b){
		System.out.println("short param!");
		}

		static void m1(int b){
		System.out.println("int param!");
		}

		static void m1(long b){
		System.out.println("long param!");
		}
}
