class DuplicateVariable 
{
	static int a = 10;
	//Static int a = 10;   duplicate variable

	static{
		int a = 10;
	}

	public static void main(String[] args) 
	{
		//Static int a = 10;
	    int a = 10;
		//int a = 10;    duplicate variable
		System.out.println("Hello World!");
	}

	static void m1(){
		int a = 10;
	}

	
}

class A
	{
		static int a = 10;
	}

class B
{
		static int a = 10;
		static void m1(){
			int a = 10;
		}

		static void m2(){
			int a = 10;
		}

		static void m3(int a){
			
		}

		static void m4(int a){
			
		}
}