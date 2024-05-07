interface Shape {
	abstract void findArea();
}

class Rectangle implements Shape
{
	double l,b;
	public void findArea(){
		System.out.println(l*b);
	}
	

}
class Square implements Shape
{
	double s;
	public void findArea(){
		System.out.println(s*s);
	}
	
}
class Circle implements Shape
{
	double r;
	static final double pi = 3.14;
	public void findArea(){
		System.out.println(pi*r*r);
	}
	
}

class Abstractmethod
{
	public static void main(String[] args){
		//we cannot instantiate interface because interface contains abstract methods which cannot be executed
		 Shape s1;
		 //s1 = new Shape();
		 //s1.findArea();


		 s1 = new Rectangle();
		 s1.findArea();

		 s1 = new Square();
		 s1.findArea();

		 s1 = new Circle();
		 s1.findArea();

		 Shape[] sa = new Shape[5];
		 sa[1] = new Rectangle();

	}

}