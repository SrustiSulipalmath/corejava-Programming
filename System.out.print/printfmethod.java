class printfmethod 
{
	public static void main(String[] args) 
	{
		System.out.print("Hello World!");
		System.out.println("Hello World!");
		System.out.printf("Hello World!");
		System.out.printf("Hello World!\n");

		System.out.println(10);
		//System.out.printf(10);
		System.out.printf("10");             //integer as string
		System.out.printf("%d",10);          //integer
		System.out.printf("%f",10.5);        //floating point
		System.out.printf("%.2f",10.5);      //floating point with 2 decimal points
		System.out.printf("%c",'a');         //character
		System.out.printf("%b",true);        //boolean
		System.out.printf("%s","HK");        //string
		System.out.printf("%s","\"HK\"\n");  //string with double quotes



		System.out.printf("%d%f%c%b%s",10,10.5,'a',true,"HK");
		System.out.printf("%d%f%c%b%s",10,10.5,'a',true,"HK\n");
		System.out.printf("%d %.2f %c %b %s",10,10.5,'a',true,"HK\n");

		System.out.println("result :"+10);  //concatination operator //display values directly
		System.out.printf("result :"+10);   //concatination operator
		System.out.println("result :"+10+20);
		System.out.printf("result :"+10+20);
		System.out.printf("result :"+10+" " +20);
		System.out.printf("result :"+10+" "+20);



		//System.out.printf("result :","%d",10);
		System.out.printf("result : %d",10);
		System.out.printf("result : %d %d",10,20);   //multiple values with text combination
	
		System.out.print(10);
		System.out.printf("\n%d",10);
	}
}


//format option when we use format specifiers
//%d : integers
//%f : floating point numbers (or) decimal numbers
//%c : character
//%b : boolean
//%s : string