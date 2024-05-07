class Bus
{
	void breaks(){
		System.out.println("Bus has normal breaks");
	}
}

class RedBus extends Bus
{
	/*public void breaks(){
		System.out.println("Break in redbus");
	}*/
}

class Express extends Bus
{
	/*public void breaks(){
		System.out.println("Break in express");
	}*/
}

class Volvo extends Bus
{
	public void breaks(){    //overridden method
		System.out.println("Volvo has powerful breaks");
	}
}

class concretemethod 
{
	public static void main(String[] args) 
	{
		Bus bus;

	    bus = new Bus();
		bus.breaks();

		bus = new RedBus();
		bus.breaks();

		bus = new Volvo();
		bus.breaks();

	}
}
