class conditionalConstruct{
    public static void main(String[] args) {
        int age = 20;
        if(age<=40){
            if(age<=15){
                System.out.println("Child");
            }else{
                System.out.println("Young");
            }
            
        }else{
            System.out.println("Old");
        }

	int mark = 95;
	String grade;
	if(mark>=90){
		grade = "A";
	}
	else if(mark>=80){
		grade = "B";
	}
	else{
		grade = "C";
	}
	System.out.println(grade);
    }
}