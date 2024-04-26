class localblock 
{
	public static void main(String[] args) 
	{
		int p = 10;
		{
			int q = 10;
			System.out.println(q);
			//int p = 20; //p scope is still available  //memory creation
			p = 20; //just assignment  //10 replaced by 20 // memory is available until memory is destroyed
		}

		//q = 20; //cannot find q declaration
		int q = 20; // q can be recreated since the scope of q has ended  //new memory is created
		System.out.println(q);
		System.out.println(p);

		//int p = 30;//p cannot be recreated since the scope of p has not ended yet
		p=30; // assign a value to a variable
		System.out.println(p);
		
	}
}
