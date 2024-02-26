class Student {}
class Faculty {}

class College{
 
 void join(Student s){}
 void teach(Faculty f){}
}

class Test{

public static void main(String[] args){

College c1 = new College();

c1.join(new Student());
c1.teach(new Faculty());

}
}