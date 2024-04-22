class Company 
{
	public static void main(String[] args) 
	{
		System.out.println("Two instance are created of Employee class for Srusti and Ranjitha objects");
		System.out.println("");

		System.out.println("e1 instance is initialized with Srusti values");
		Employee e1 = new Employee();
		e1.eno= 1001;
		e1.ename = "srusti";
		e1.sal = 100000;
		e1.dept = "developer";

		System.out.println("e1 instance is initialized with Ranjitha values");
		Employee e2 = new Employee();
		e2.eno = 1002;
		e2.ename="ranjitha";
		e2.sal = 40000;
		e2.dept = "tester";

		System.out.println("\n e1 pointing(Srusti) values");
		System.out.println("e1.eno\t: "+e1.eno);
		System.out.println("e1.ename\t: "+e1.ename);
		System.out.println("e1.sal\t: "+e1.sal);
		System.out.println("e1.dept\t: "+e1.dept);

		System.out.println("\n e2 pointing(Ranjitha) values");
		System.out.println("e2.eno\t: "+e2.eno);
		System.out.println("e2.ename\t: "+e2.ename);
		System.out.println("e2.sal\t: "+e2.sal);
		System.out.println("e2.dept\t: "+e2.dept);

		

	}
}
