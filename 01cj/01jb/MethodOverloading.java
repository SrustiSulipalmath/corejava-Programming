class MethodOverloading{
static void add(int a,int b){ 
     int c = a+b;
    System.out.println(c);
}

static void add(int a,int b,int c){ 
     int d = a+b+c;
    System.out.println(d);
}

static void add(int a,String s){ 
     String f = a+s;
    System.out.println(f);
}

    
public static void main(String[] args){
    System.out.println("main");
     add(5,6);   
     add(5,6,2);                   //arguments = input values
     add(5,"Srusti");
}
    
}
