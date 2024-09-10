

//program shows initialising instance fields via constructor with variable shadowing problem solution
class Example
{
	private int x;
	private int y;

	Example(int x, int y){  //no-param constructor
		this.x = x;
		this.y = y;
	}

	void display(){  //param constructor
		System.out.println(x+" "+y);
		
	}

	

	
}

class test02
{
	public static void main(String[] args) 
	{
		
		Example e1 = new Example(10,20);
		e1.display();
		
	}
	
}	
				