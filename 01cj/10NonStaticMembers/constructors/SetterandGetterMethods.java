class Example 
{
	private int x;
	private int y;

	Example(int x, int y){
		this.x = x;
		this.y = y;
	}

	void setX(int x){
		this.x = x;
	}

	void setY(int y){
		this.y = y;
	}

	int getX(){
		return x;
	}

	int getY(){
		return y;
	}

	void display(){
		System.out.println(x+" "+y);
	}
}

class SetterandGetterMethods
{
	public static void main(String[] args){
		
		Example e1 = new Example(5,6);
		e1.display();

		e1.setX(30);
		e1.setY(40);

		e1.display();

		e1.setX(e1.getX()+50);
		e1.setY(e1.getY()+60);
		e1.display();
	}
}
