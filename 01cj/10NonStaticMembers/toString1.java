class toString1 
{
	int x =10;
	int y = 20;

	public String toString(){
		return "Hi";
	}


	public static void main(String[] args) 
	{
		toString1 ts1 = new toString1();
		toString1 ts2 = null;
		toString1 ts3;

		//System.out.println(ts1);   //class object as argument to println method
		System.out.println(ts1);
		System.out.println(ts2);
		System.out.println(ts3);

	}
}
