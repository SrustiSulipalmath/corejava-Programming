class Addition 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = add(a,b);
		System.out.print(c);
		System.out.printf("\n%d",c);
		m1(c);

		System.out.print("The addition of a and b is c : "+c );
		System.out.printf("\n The addition of a and b is c : %d",c);

		System.out.print("\nThe addition of "+a+ " and " + b + "is c : "+c );
		System.out.printf("\nThe addition of %d and %d is c : %d",a,b,c);
		


	}

static int add(int a,int b){
	return a+b;
}
static void m1(Object obj){
	System.out.println(obj);
}
}

//printf functionality is provided by println method




//static int add(int a,int b){
//	int c= a+b;
//	return c;
//}

//we are using only 1 time hence no need of storing in seperate variable memory waste
















