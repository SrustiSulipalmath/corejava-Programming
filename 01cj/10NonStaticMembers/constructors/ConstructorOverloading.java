class Example 
{
	private int x;
	private int y;

	Example(){
		System.out.println("Object initialization is going on...");
		System.out.println("By using no-param constructor");
		x=10;
		y=20;
	}

	Example(int x, int y){
		System.out.println("Object initialization is going on...");
		System.out.println("By using int param constructor");
		this.x = x;
		this.y = y;
	}

	Example(Integer x, Integer y){
		System.out.println("Object initialization is going on...");
		System.out.println("By using Integer param constructor");
		this.x = x.intValue();
		this.y = y.intValue();
	}

	Example(String x , String y){
		System.out.println("Object initialization is going on...");
		System.out.println("By using String param constructor");
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}

	void display(){
		System.out.println(x+" "+y);
	}
}

class ConstructorOverloading
{
	public static void main(String[] args) 
	{

		Example e1 = new Example();
		System.out.println("e1 object values : ");e1.display();

		Example e2 = new Example(22,33);
		System.out.println("e2 object values : ");e2.display();

		//Example e3 = new Example(new Integer(50),new Integer(60));   deprecated code
		Example e3 = new Example(Integer.valueOf(50),Integer.valueOf(60));                             //new alternate code factory method
		System.out.println("e3 object values : ");e3.display();       

		Example e4 = new Example("70","80");
		System.out.println("e4 object values : ");e4.display();

		
	}
}
