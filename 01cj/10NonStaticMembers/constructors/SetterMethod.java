class Example 
{
	private int x;
	private int y;

	Example(int x, int y){
		this.x = x;
		this.y = y;
	}

	void set(int x,int y){
		this.x = x;
		this.y = y;
	}


	void display(){
		System.out.println(x+" "+y);
	}
}

class SetterMethod
{
	public static void main(String[] args){
		
		Example e1 = new Example(5,6);
		e1.display();

		e1.set(30,40);

		e1.display();

		
}

}

