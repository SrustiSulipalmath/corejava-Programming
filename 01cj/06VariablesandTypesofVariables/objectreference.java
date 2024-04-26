class objectreference 
{
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println(a);

		a= 20;
		System.out.println(a);  //latest modified value , new value

		Example e1 = new Example(); //this is new object
		System.out.println(e1);  //internal reference

		e1 = new Example() //  both are different , this is another new object
		//when we refer a new object to a referenced variable old object reference is replaced by new object reference existing object is eligible for garbage collection
		//that object is not refernced by any another variable stop referencing to old object and start referencing to new object
;
		System.out.println(e1); // new internal reference when we access a variable 
		
		Example e3 = new Example();
		Example e4 = e3;
		e3 = new Example();
		e3.x = 15;
		e3.y = 16;

		System.out.println(e3.x + " " +e3.y);
		System.out.println(e4.x + " " +e4.y);
		}
}
