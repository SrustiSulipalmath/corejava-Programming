class terneryOperator{
    public static void main(String[] args) {
       //variable = (condition)?exp.1:exp.2
       int a = 2,b=3,c=4;
       int max =(a>b)?a:b;
        System.out.println(max);
	int max =(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);


	int p = 2,q=3,r=4;
        max =(p>q)?(p>r?p:r):(q>r?q:r);
        System.out.println(max);

	int mark = 55;
        String grade = (mark >=90)?"A":(mark>=80)?"B":"C";
        System.out.println(grade);
    }
}