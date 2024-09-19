class IncrDecr 
{
	public static void main(String[] args) 
	{
		int x,y;
		x=1;
		y = x++ + ++x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println();

		x=1;
		y =x++ + ++x + x++ + x-- + --x + ++x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println();

		x=1;
		y = ++x + --x - x-- + x++ - ++x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println();

		x=1;
		y = ++x + ++x + x++ + x++ + --x + x-- - ++x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println();

		x=1;
		x++;
		y = x++ + ++x - x-- + --x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println();

		int[] a ={5,10,15};
		int i = 0,num;
		num = a[++i] + ++i + (++i);
		System.out.println("i:"+i);
		System.out.println("num:"+num);
		System.out.println();

		i = num = 0;
		num = a[i++] + i++ + (i++);
		System.out.println("i:"+i);
		System.out.println("num:"+num);
		System.out.println();

	}
}
