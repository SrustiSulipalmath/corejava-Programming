import java.util.Scanner;
class ArithmeticOperator{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition :"+(a+b));
        System.out.println("Subtraction :"+(a-b));
        System.out.println("multiplication :"+(a*b));
        System.out.println("division quetiont :"+(a/b));
        System.out.println("division remainder :"+(a%b));
        

        
    }
}