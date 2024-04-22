class College 
{

	public static void main(String[] args) 
	{
		//two instances are created from class student
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println("Two instances are created for Srusti and Rishita objects");
		System.out.println();

		//Storing objects Srusti and Rishita values in above instances

		s1.sno    = 101;
		s1.sname  = "Srusti";
		s1.course = "CJ";
		s1.fee    = 2500;
		System.out.println("s1 instance is initialized with Srusti values");
		System.out.println();

		s2.sno    = 102;
		s2.sname  = "Rishita";
		s2.course = "Acting";
		s2.fee    = 3500;
		System.out.println("s2 instance is initialized with Rishita values");
		System.out.println();

		System.out.println(" s1 pointing object (Srusti) values");
		System.out.println(" s1.sno\t: "+s1.sno);
		System.out.println(" s1.sname\t: "+s1.sname);
		System.out.println(" s1.course\t: "+s1.course);
		System.out.println(" s1.fee\t: "+s1.fee);
		System.out.println();

		System.out.println(" \ns2 pointing object (Rishita) values");
		System.out.println(" s2.sno\t: "+s2.sno);
		System.out.println(" s2.sname\t: "+s2.sname);
		System.out.println(" s2.course\t: "+s2.course);
		System.out.println(" s2.fee\t\t: "+s2.fee);
		System.out.println();
	}
}
