class Dynamicloadingofclass 
{
	static{
		System.out.println("Dynamicloadingofclass class is loaded");
	}
	public static void main(String[] args)throws ClassNotFoundException
	{
		System.out.println("Dynamicloadingofclass main -execution start");
		Class.forName("cload");
		System.out.println("Dynamicloadingofclass main -execution end");
	}
}


//.class must already be available   loading class into jvm and accesing members