//use -performing calculations(add,sub,mul,div)
//how many -5
//any rules-AO are allowed to apply to Numeric Datatypes-->b,s,i,l,f,d,char
						// we cannot use them for boolean data types
//result type -->numeric-->based on the datatypes used in calculation
class Test01_ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		int i1=10+20;
		System.out.println(i1);
		boolean bo1=true;
		boolean bo2=false;
	  //boolean bo3=10+20;
	  //boolean bo4=10.0+20;//result type = double
	  //boolean bo5='a'+'b';//char+char result type = integer

	  byte b1 = 10;
	  byte b2 = 20;
	 //boolean bo6= b1+b2;  //byte +byte result type = integer
	  short s1 =10;
	  short s2 = 20;
	//boolean bo7 = s1+s2 //short+short result type =integer

	}

//char+char result type = integer
//byte +byte result type = integer
//short+short result type =integer

byte b5 = 10;
byte b6 = 20;
//byte b7 = b5+b6;
//byte b8 = (byte)b5+b6;
//byte b9 = (byte)b5+(byte)b6;
byte b10 = (byte)(b5+b6);

byte b11 = 10+20;
//byte b12 = 100+20;

//byte b13 = 10L
byte b14 =(byte)10L;   //10                           //constant expression   //10L(literal)->result - 10
byte b15 =(int)10L;     //10                        //cast operator expression   //from constant exp value is coming hence no error

long l1 = 10L;
//byte b16 = l1;                               //variable expression --> compiler uses variable types
byte b17 = (byte)l1;     //byte

byte b18 = (int)l1;       //int

byte b19 = 10;
byte b20 = 20;
//byte b21 = b19+20;   //int                          //variable expression


final byte b21 = 10;
byte b22 = b21+20;

final byte b24= 10;
final byte b25 = 20;
byte b26 = b24+b25;

finalbyte b27;
final byte b28;

b27=10;
b28=20;
byte b29 = b27+b28;  //expression is evaluated by types  //no value in the declaration line//if ot initailzed byte + byte result->int
}

//expression evaluation