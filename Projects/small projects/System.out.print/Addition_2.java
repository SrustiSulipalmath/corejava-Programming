class Addition_2 
{
	public static void main(String[] args) 
	{
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = add(a,b);
		

		System.out.print("\nThe addition of "+a+ " and " + b + "is c : "+c );
		//System.out.printf("\nThe addition of %d and %d is c : %d",a,b,c);
		System.out.printf("\nThe addition of %f and %f is c : %d",a,b,c);
		


	}

static int add(int a,int b){
	return a+b;
}

static double add(double a,double b){
	return a+b;
}

}
