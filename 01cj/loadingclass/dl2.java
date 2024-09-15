
//just loading the class not accessing the members even static members

class dl2  
{
	public static void main(String[] args) 
	{
		System.out.println("Dynamicloadingofclass main -execution start");
		Class cls = cload.class;
		System.out.println("Dynamicloadingofclass main -execution end");
	}
}
