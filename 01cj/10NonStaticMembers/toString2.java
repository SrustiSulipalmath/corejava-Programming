class toString2 
{
	int x =10;
	int y = 20;

	public String toString(){
		return "Hi";
	}


	public static void main(String[] args) 
	{
		toString2 ts1 = new toString2();
		toString2 ts2 = null;
		toString2 ts3;

		//System.out.println(ts1);   //class object as argument to println method
		System.out.println(ts1.toString());
		System.out.println(ts2.toString());
		System.out.println(ts3.toString());

	}
}
