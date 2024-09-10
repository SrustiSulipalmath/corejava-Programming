class EmptyVariable 
{
	int x = 10;
	int y = 20;

	static EmptyVariable ev1;
	static EmptyVariable ev1 = new EmptyVariable();



	public static void main(String[] args) 
	{
		if (ev1 != null)
		{
			System.out.println(ev1.x);
		}
		

	}
}
