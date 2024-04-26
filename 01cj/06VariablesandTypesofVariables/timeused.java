class timeused 

//improve the performance of the application decrease the unnecessary variables created
{
	public static void main(String[] args) 
	{
		long time1, time2;

		time1=System.nanoTime();
		int x = 10;
		System.out.println(x);
		time2=System.nanoTime();
		System.out.println(time2-time1);
		System.out.println();

		time1=System.nanoTime();
		System.out.println(10);
		time2=System.nanoTime();
		System.out.println(time2-time1);
		System.out.println();


		time1=System.nanoTime();
		int a =10;
		int b=20;
		int c = a+b;
		time2=System.nanoTime();
		System.out.println(time2-time1);

		time1 = System.nanoTime();
		int d = 10+20;
		time2=System.nanoTime();
		System.out.println(time2-time1);
		System.out.println();


		time1 = System.nanoTime();
		Example e1 = new Example();
		System.out.println(e1.x);
		time2 =System.nanoTime();
		System.out.println(time2-time1);

		time1 = System.nanoTime();
		System.out.println(new Example().x);
		time2 =System.nanoTime();     
		System.out.println(time2-time1);
		System.out.println();

		time1 = System.nanoTime();
		Example e2 = new Example();
		System.out.println(e2.x);
		System.out.println(e2.y);        //x and y values reading from 1 object
		time2=System.nanoTime();
		System.out.println(time2-time1);

		time1 = System.nanoTime();
		System.out.println(new Example().x);
		System.out.println(new Example().y);        //x and y values reading from different object
		time2=System.nanoTime();
		System.out.println(time2-time1);
		System.out.println();

	}
}
