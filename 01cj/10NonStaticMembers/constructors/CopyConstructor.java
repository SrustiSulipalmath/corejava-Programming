class Example
{

	int x;

	Example(){    //no-param constructor
		x = 50;
	}

	Example(int x){  //param constructor
		this.x = x;
	}
	
	Example(Example e){ //copy constructor
		this.x = e.x;    //copy argument data into current object
	}
}

class CopyConstructor
{
	public static void main(String[] args){

		Example e1 = new Example();      //object creation by using NPC
		Example e2 = new Example(70);    //object creation by using IPC
		Example e3 = new Example(e2);	//object creation by using Copy constructor
		Example e4 = e2;

		System.out.println(e1+" "+e1.x);
		System.out.println(e2+" "+e2.x);
		System.out.println(e3+" "+e3.x);
		System.out.println(e4+" "+e4.x);
		
	}
} 