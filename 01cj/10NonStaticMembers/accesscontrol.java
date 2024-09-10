class Example
{
	private int x;
	private int y;

	Example(){  //constructor
		x = 10;
		y = 20;
	}

	void display(){
		System.out.println(x);
		System.out.println(y);

	}

	void m1(){  //method
		x = 10;
		y = 20;
	}

	{  //block
		x = 10;
		y = 20;
	}

}

class accesscontrol
{
	public static void main(String[] args) 
	{
		Example e1 = new Example();   //noparam constructor      
		Example e2 = new Example();
		
		e1.display();
		e2.display();
				
	}
}
