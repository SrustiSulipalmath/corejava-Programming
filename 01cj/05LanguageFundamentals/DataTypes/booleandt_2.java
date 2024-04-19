class booleandt_2 
{
	public static void main(String[] args) 
	{
	  m1(5);
	  m3();
	  m4();
	  m5();
	  m6();
	  m7(); 
	  
	  
	}

	static void m1(int a){
		if(a<10){
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}

		while(a<10){
		System.out.println("Hi:"+a);
		a++;
	  }
	}

	static void m2(){
		int a = 10;
		//if(a=10)
		if(a==10){
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}
	}

	static void m3(){
		boolean bo = true;
		if (bo = true)
		{
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}
		System.out.println(bo);

	}

	static void m4(){
		boolean bo = false;
		if (bo =false)  //replace
		{
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}
		System.out.println(bo);
	
	}

		static void m5(){
		boolean bo = true;
		if (bo =false)
		{
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}
		System.out.println(bo);



		//if(false) means execute else block and display boolean value
	
	}

	static void m6(){
		boolean bo = true;
		if (bo == true) //reading
		{
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}
		System.out.println(bo);
	}

	static void m7(){
		boolean bo = true;
		if (bo == false) //reading
		{
			System.out.println("in if");
		}else{
			System.out.println("in else");
		}
		System.out.println(bo);
	}
}
