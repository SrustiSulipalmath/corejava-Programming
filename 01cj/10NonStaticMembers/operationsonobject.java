class Example
{
	int x;
	int y;

}


class operationsonobject
{
	public static void main(String[] args) 
	{
		Example e1 = new Example();         //object creation
		System.out.println(e1.x + " " + e1.y);      //reading

		e1.x = 10;     //initialization
		e1.y = 20;
		
		System.out.println(e1.x + " " + e1.y);       //reading
		
		e1.x = 15;         //modifying
		e1.y = 16;

		System.out.println(e1.x + " " + e1.y);

		//code redundancy

		Example e2 = new Example();         //object creation
		System.out.println(e2.x + " " + e2.y);      //reading

		e2.x = 10;     //initialization
		e2.y = 20;
		
		System.out.println(e2.x + " " + e2.y);       //reading
		
		e2.x = 15;         //modifying
		e2.y = 16;

		System.out.println(e2.x + " " + e2.y);
	}
}

