class Example
{
	int x = 10;
	int y = 20;

	public String toString(){
		//return ""+x;
		//return ""+y;
		return x+" "+y;
	}
}


class contentofobject
{
	public static void main(String[] args) 
	{
		Example e1 = new Example();
		System.out.println(e1);

		String s1 = new String ("Srusti");
		System.out.println(s1);
	}
}
