import java.util.Scanner;

class Example
{
	private int x;
	private int y;
	private int z;

	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x:");
		x = sc.nextInt();
	}

	Example(){
		 y = 20;
		 z = 30;
	}

	Example(int p,int q){
		this.y = p;
		this.z = q;
	}

	public String toString(){
		
		return x+" "+y+" "+z;
	}

	public static void main(String[] args){
		
		Example e1 = new Example();
		System.out.println("e1 values : "+e1);

		Example e2 = new Example(50,60);
		System.out.println("e2 values : "+e2);
	}



}
