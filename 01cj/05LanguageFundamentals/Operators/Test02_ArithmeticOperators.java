class Test02_ArithmeticOperators 
{     

	//+operator special case    --> + operator is a overloaded operator
	//+operator can do 2 operations 
	//1)addition operation   --> numeric/character if both operands are
	//2)concatenation operator   --> atleast 1 operand is a string  then it acts as concatenation operator
	//it will join/append both operand values and generates new value


	public static void main(String[] args) 
	{
		int i1 = 10;
		int i2 = 20;
		int i3 = i1+i2;
		System.out.println(i3);

		String s1 = "S";
		String s2 = "G";
		String s3 = s1+s2;
		System.out.println(s3);

		String s4 = s1+s2+1;
		String s5 = s1+s2+"#"+1;
		//String s6 = s1-2;
		//String s7 = s1*2;

		char ch1 = 'a';
		char ch2 = 'b';
				
		//char ch3 = ch1+ch2;    ----- char+char = int
		char ch3 = (char)(ch1+ch2);
		System.out.println((int)ch3);

		System.out.println(10+20);  //int 30
		System.out.println(""+10+20);  // 2 operators  --> operators associtivity  ,string format,2types(highest range converted into)
		System.out.println("10"+20);
		System.out.println(""+(10+20));   //string30
		System.out.println(10+20+"");  //10+20 is first evaluated
		
		//left operand,right operand,bracket

		int p=10;
		int q = 20;
		System.out.println(p+q); //int 30
		System.out.println("p"+"q");
		System.out.println("p+q");
		System.out.println("p+q"+p+q);//p+q1020
		System.out.println("p+q"+(p+q));//p+q30
		System.out.println(p+q+10+20);//60

		//System.out.println("p-q"+p-q);     //evaluation order operator precedence
		System.out.println("p-q"+(p-q));
		System.out.println("p*q"+p*q);//noerror p*q200

		System.out.println(22/7*10*10);  //300
		System.out.println(22.0/7*10*10);  //314.---
		System.out.println(22.0F/7*10*10);  //314.---4valuesdigits
		//int+int=int
		//int/int=int

		//0 divided by any no is 0
		//any number divided by 1 itself

		System.out.println(0/2);//0
		System.out.println(2/1);//2
		System.out.println(1/2);//0
		System.out.println(0.0/2);//0.0
		System.out.println(2.0/2);//2.0
		System.out.println(2/0); //exception
		System.out.println(2.0/0); //Infinity
		System.out.println(2.0F/0); //I
		System.out.println(-2.0/0);//-I
		System.out.println(0/0);//exception   //undefined 0/0 NaN

		//int range system no infinity value

		//10+20; single statement not allowed
		int r = 10+20;
		System.out.println(10+20);  //method argument   println(int)
		static int m2(){
			return 10+20;
		}  //return type
		
		//+ operator with referenced datatypes

		A a1 =new A();
		A a2 =new A();
		A a3 =a1+a2;
	}
}
