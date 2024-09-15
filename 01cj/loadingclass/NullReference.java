
//i have not accessed any member from the class just created reference variable class not loaded into jvm

class NullReference  
{
	static{
		System.out.println("sample sb is loaded");
	}
	public static void main(String[] args) 
	{
		System.out.println("sample main execution started");
		System.out.println(=====================1============);		
		cload c1;
		//c1=new cload;   class is loaded
		System.out.println(=====================2============);
	}
}