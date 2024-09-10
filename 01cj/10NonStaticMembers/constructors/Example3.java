

class Example3
{
	 private static int count;
	
	{
		count++;
	}
	

	Example3(){
		 
	}

	Example3(int x){
		
	}

	Example3(String s){
		
	}
	static int getCount(){
		return count;
	}


	public static void main(String[] args){
		
		Example3 e1 = new Example3();
		Example3 e2 = new Example3();
		Example3 e3 = new Example3(10);
		Example3 e4 = new Example3("a");
		System.out.println(Example3.getCount());


	}



}

