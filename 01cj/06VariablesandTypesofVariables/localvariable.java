class localvariable
{
	static int a = 10;
	int x = 20;
	//localvariable lv1;  //non static referenced variable
	static localvariable lv1;

	public static void main(String[] args) 
	{
		int p = 30;
		System.out.println("a: "+ a);
		//System.out.println("x: "+ x);

		localvariable lv = new localvariable();
		System.out.println("x: "+ lv.x);

		System.out.println("p: "+ p);
		m1();
	    lv1 = new localvariable();
		System.out.println("x: "+ lv1.x);


	}

	static void m1(){
		System.out.println("a : "+ a);
		//System.out.println("x: "+ x);
		//System.out.println("x: "+ lv.x);    lv is a local variable of main method hence scope is main method hence we cannot access from another method

		//object created from another method can be accessed from one more method depends on the scope of the variable
		//increase the scope of variable or object
		
				System.out.println("x: "+ lv1.x);
		localvariable lv2 = new localvariable();
		System.out.println("x: "+ lv2.x);

	}
}
