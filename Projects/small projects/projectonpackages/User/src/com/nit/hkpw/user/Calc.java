
package com.nit.hkpw.user;
//import com.nit.hkpw.blogic.add.Addition;
//import com.nit.hkpw.blogic.add2.Addition;
import com.nit.hkpw.blogic.sub.Subtraction;
import com.nit.hkpw.blogic.mul.Multiplication;
import com.nit.hkpw.blogic.div.Division;

public class Calc{
	
	public static void main(String[] args){
	int res1 = com.nit.hkpw.blogic.add.Addition.add(5,5);
	int res2 = com.nit.hkpw.blogic.add2.Addition.add(3,5,2);
	int res3 = Subtraction.sub(5,3);
	int res4 = Multiplication.mul(2,2);
	int res5 = Division.div(8,4);

	System.out.println(res1);
	System.out.println(res2);
	System.out.println(res3);
	System.out.println(res4);
	System.out.println(res5);

}

}