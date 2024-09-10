


//implementing variable shadowing in constructor and its problem



	

class Example
{
	private int x;
	private int y;

	Example(int x, int y){  //no-param constructor
		x = x;
		y = y;
	}

	void display(){  //param constructor
		System.out.println(x+" "+y);
		
	}

	

	
}

class test01
{
	public static void main(String[] args) 
	{
		
		Example e1 = new Example(10,20);
		e1.display();
		
	}
	
}	
				