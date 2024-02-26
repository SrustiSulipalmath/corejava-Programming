// calling main method 
//either we can use object of that class or current class object to call that class from another class


class A {
    public static void main(String[] args){
        System.out.println("A main");
}
}

class B {
    public static void main(String[] args){
        System.out.println("B main");
        A.main(new String[0]);
        A.main(args);  //same name is passed
        }
}