class NonStaticVaraibles 
{
	int x = 10;
	int y = 20;

	public static void main(String[] args) 
	{
		int a = 50;
		int b = 60;

		System.out.println(a);
		System.out.println(b);

		//System.out.println(x);
		//System.out.println(y);

		NonStaticVaraibles ns1 = new NonStaticVaraibles();
		NonStaticVaraibles ns2 = new NonStaticVaraibles();
		
		System.out.println(ns1.x);
		System.out.println(ns1.y);

		System.out.println(ns2.x);
		System.out.println(ns2.y);


		ns1.x = 15;
		ns1.y = 16;
		
		System.out.println(ns1.x);
		System.out.println(ns1.y);

		System.out.println(ns2.x);
		System.out.println(ns2.y);
		
		NonStaticVaraibles ns3 = ns2;
		System.out.println(ns3.x);
		System.out.println(ns3.y);

		ns2.x = 18;
		ns2.y = 19;

		System.out.println("ns2"+ns2.x);
		System.out.println(ns2.y);

		System.out.println("ns3"+ns3.x);
		System.out.println(ns3.y);



	}
}
