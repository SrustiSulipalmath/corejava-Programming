class printfmethod_2 
{
	public static void main(String[] args) 
	{
		//System.out.printf();  CE
		System.out.printf("Hi");
		//System.out.printf("Hi %d"); //RTE
		System.out.printf("Hi %d",5);
		//System.out.printf("Hi %d %d",5); //RTE
		System.out.printf("Hi %d %d",5,6);
		System.out.printf("Hi %d %d",5,6,7);
		System.out.printf("Hi "+5);
		System.out.printf("Hi %d",5);
	}
}
