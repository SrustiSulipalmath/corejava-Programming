class floatingpointdatatype 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		//boolean b = 5.5;
		m1(5.5);
		//float f1 =10.0;
		m1((float)10.0);
		m1(10.0F);
		m1(10.0f);
		//int i1 = 10.5;
		//float f1= 10.5;

		int i2 = (int)10.5;
		float f2= (float)10.5;
		float f3=10.5F;

		m1(5);
		m2(5);
		//m2(5.0);
		m2(5.0f);
		m2(5.0f);
		m2((float)5.0);
		m2(5.0);

		}

		static void m1(float f){
			System.out.println("float param!");
		}

		static void m1(double d){
			System.out.println("double param!");
		}

		static void m2(float a){
			System.out.println("float param!");
		}

		static void m2(int b){
			System.out.println("int param!");
		}

		static void m2(double d){
			System.out.println("double param!");
		}
}
