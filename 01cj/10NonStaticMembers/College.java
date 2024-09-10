
//HANDLING NULL POINTER EXCEPTION


class Student 
{
	int sno;
	String sname;
	Address address;

	void setSno(int sno){
		this.sno = sno;
	}

	void setSname(String sname){
		this.sname = sname;
	}

	void setAddress(Address address){
		this.address = address;
	}

	public void display(){
		System.out.println("sno :"+sno);
		System.out.println("sname :"+sname);
		System.out.println("address :"+address);
		//System.out.println("address strNum :"+address.strnum);
		//System.out.println("address city :"+address.city);

		if (address != null)
		{ 
			System.out.println("address strNum :"+address.strnum);
			System.out.println("address city :"+address.city);
		}else{
			System.out.println("Please set the address for this student "+ sname);
		}
	}
	
}

class Address
{
	int strnum;
	String city;

	void setStrnum(int strnum){
		this.strnum = strnum;
	}

	void setCity(String city){
		this.city = city;
	}
}

class College
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setSno(101);
		s1.setSname("Srusti");

		Address addr = new Address();
		addr.setStrnum(1);
		addr.setCity("Hyd");

		s1.setAddress(addr);

		s1.display();
	}
}
