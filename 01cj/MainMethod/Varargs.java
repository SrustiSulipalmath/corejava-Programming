class Varargs 
{

	static void add(int a, int b){
		int c = a+b;
		System.out.println(c);

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		add(5,6);
		System.out.println(args[0]);
		System.out.println(args[1]);

		//int a = args[0];  // string type cannot be stored in int type
		//int b = args[1];  // runtime values available as string type

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a);
		System.out.println(b);


        A.main(new String[]{"a","b"});   //pass string object explicitly
        A.main("a","b");                 //calling main method without creating array object
		A.main();                        //calling main method without any arguments
	}
}

class A
{
	public static void main(String... args){
		
	}
}


//Integer.parseint predefined static method