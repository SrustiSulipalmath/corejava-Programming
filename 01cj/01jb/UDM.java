class UDM{
  void m1(){
	System.out.println("m1");   //method creation/defination
	}
	public static void main(String[] args){
	 System.out.println("main");
		m1();                  //method calling
					//compile time error because no memory

	}
	


		//non static method cannot be referenced from static context
}