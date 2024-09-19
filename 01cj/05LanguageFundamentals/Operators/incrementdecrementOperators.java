class incrementdecrementOperators  //unary operators 
{
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println(a);
		a++;  //exactly by 1 value
		System.out.println(a);
		int b = 10;
		System.out.println();


		System.out.println(b);
		b--;
		System.out.println(b);

		//++a  pre increment first increment and then read value,use in this expression(expression is exe with incremented value)
		//a++  post increment(increase value) first read value ,substitute in expression  and then increment(expression is exe with old value

		//--a  pre decrement first decrement and then read value,use in this expression(expression is exe with incremented value)
		//a--  post decrement first read value ,substitute in expression  and then decrease(expression is exe with old value
	
		System.out.println();

		int x = 10;
		int y = 20;

		System.out.println(x);
		x++;//single statement (use in another expression)
		System.out.println(x);

		System.out.println(y);
		++y;
		System.out.println(y);
		System.out.println();

		x=1;
		y=x++;
		System.out.println(x);//(1) but 2
		System.out.println(y);//(2) but 1    executed with original value
		System.out.println();

		x=1;
		y=++x;
		System.out.println(x);//2
		System.out.println(y);//2   executed with modified value
		System.out.println();

		x=1;
		System.out.println(x++);//1
		System.out.println(x);//2   expression evaluation,passing as argument
		System.out.println();
	
		x=1;
		System.out.println(++x);//2
		System.out.println(x);//2
		System.out.println();

		x=1;
		y = x++ + ++x + ++x + x++ + --x + x-- - --x + --x;
		System.out.println(x);
		System.out.println(y);
	}
}
