import java.util.Scanner;

class Example2
{
	private int x;
	private int y;
	private int z;

	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x:");
		x = sc.nextInt();
	}

	Example2(){
		 y = 20;
		 z = 30;
	}

	Example2(int p,int q){
		this.y = p;
		this.z = q;
	}

	public String toString(){
		
		return x+" "+y+" "+z;
	}

	public static void main(String[] args){
		
		Example2 e1 = new Example2();
		System.out.println("e1 values : "+e1);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter y:");
		int y = sc1.nextInt();
		System.out.println("Enter z:");
		int z = sc1.nextInt();


		Example2 e2 = new Example2(y,z);
		System.out.println("e2 values : "+e2);
	}



}
