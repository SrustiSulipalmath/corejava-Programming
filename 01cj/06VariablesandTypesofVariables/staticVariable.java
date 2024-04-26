class staticVariable 
{
	static int x;
	int y;
	public static void main(String[] args) 
	{
		staticVariable sV1 = new staticVariable();
		staticVariable sV2 = new staticVariable();
		staticVariable sV3 = new staticVariable();
		staticVariable sV4 = new staticVariable();
		staticVariable sV5 = new staticVariable();
		
		staticVariable.x = 10;
		System.out.println(sV1.x);
		sV1.x = 25;


		/*sv1.x = 10;  sv1.y = 15;
		sv2.x = 10;  sv2.y = 16;
		sv3.x = 10;  sv3.y = 17;
		sv4.x = 10;  sv4.y = 18;
		sv5.x = 10;  sv5.y = 19;*/

		sV1.y = 15;
	    sV2.y = 16;
		sV3.y = 17;
		sV4.y = 18;
		sV5.y = 19;

		System.out.println(sV1.x+" "+sV1.y);
		System.out.println(sV2.x+" "+sV2.y);


		staticVariable.x = 25;
		sV1.y = 32;

		System.out.println(sV1.x+" "+sV1.y);
		System.out.println(sV2.x+" "+sV2.y);


	}




}
