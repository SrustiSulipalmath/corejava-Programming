public class Test_0 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>60){
            throw new TooOldException("age is crossed");
        }
        else if(age<18){
            throw new TooYoungException("wait some years");
        }
        else{
            System.out.println("Thanks for Registration");
        }
    }
}
//throw keyword->customized exceptions