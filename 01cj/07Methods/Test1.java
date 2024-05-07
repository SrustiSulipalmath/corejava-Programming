class Employee 
{
	int eno;
	String ename;
	double sal;
	String dept;
}

class Company
{
	 void display(Employee e){
		System.out.println("e.eno\t:"+e.eno);
		System.out.println("e.ename\t:"+e.ename);
		System.out.println("e.sal\t:"+e.sal);
		System.out.println("e.dept\t:"+e.dept);
		
	}
	 void annSal(Employee e){
	
		e.sal = (e.sal*12);
		System.out.println("e.annSal\t:"+e.sal);

		//System.out.println("e.ename +'''s annual salary is :"+(e.sal*12));
		
	}
	 void incrSal(Employee e,int perc)
	{
		e.sal = e.sal + (e.sal*perc/100);
		System.out.println("e.incrSal\t:"+e.sal);

		//e.sal = e.sal + (e.sal*perc/100);
		//System.out.println(e.sal);
	}
}

class Test1
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.eno = 101;
		e1.ename = "HK";
		e1.sal= 1000;
		e1.dept = "CJ";
		System.out.println("Employee object is created and initialized with HK values");
		
		Company c1 = new Company();
		System.out.println("e1 object values");

		c1.display(e1);

		c1.annSal(e1);

		c1.incrSal(e1,20);


		/*
		System.out.println("e1.ename+'''s old monthly salary :"+e1.sal);
		c1.incrSal(e1,20);
		System.out.println("e1.ename+'''s updated monthly salary :"+e1.sal);
		*/
	}
}














