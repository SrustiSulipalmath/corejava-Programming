class LocalPreferenceAlgo 
{
	static int a = 10;
	public static void main(String[] args) 
	{
		int a = 50;
		System.out.println(a);
		System.out.println(LocalPreferenceAlgo.a);

		a = 70;
		System.out.println(a);
		System.out.println(LocalPreferenceAlgo.a);
		

		LocalPreferenceAlgo.a = 80;
		System.out.println(a);
		System.out.println(LocalPreferenceAlgo.a);
		
	}
}
