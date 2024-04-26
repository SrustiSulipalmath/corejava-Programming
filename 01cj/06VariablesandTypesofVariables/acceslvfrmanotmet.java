class  acceslvfrmanotmet
{
	static int r = 30;
	public static void main(String[] args) 
	{
		int p = 10;
		System.out.println("in main p: "+p);

		int q = 20;
		System.out.println("in main q: "+q);
		m1(q);
		m2();

		
		System.out.println("in main r: "+r);
	}

	static void m1(int q){
		//System.out.println("in m1 p: "+p);
		System.out.println("in m1 q: "+q);
		System.out.println("in m1 r: "+r);
	}
	
	static void m2(){
		System.out.println("in m2 r: "+r);
	}
}
