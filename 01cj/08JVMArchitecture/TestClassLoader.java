class TestClassLoader 
{
	public static void main(String[] args) 
	{
		System.out.println("String class ClassLoader Name :"+String.class.getClassLoader());
		System.out.println("p1.A class ClassLoader Name :"+p1.A.class.getClassLoader());
		System.out.println("p2.B class ClassLoader Name :"+p2.B.class.getClassLoader());
	}
}
