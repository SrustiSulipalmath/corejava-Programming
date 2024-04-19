class Calc{

    public static void main(String[] args){
       
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    Addition.add(a,b);
    Subtraction.sub(a,b);
    Multiplication.mul(a,b);
    Division.div(a,b);

	int addRes = Addition.add(a,b);
	int subRes = Subtraction.sub(a,b);
	int mulRes = Multiplication.mul(a,b);
        int divRes = Division.div(a,b);

	System.out.println();
	System.out.println("Addition Result : "+addRes);
	System.out.println("Subtraction Result : "+subRes);
	System.out.println("Multiplication Result : "+mulRes);
	System.out.println("Division Result : "+divRes);
    
    
    
    
    }
}