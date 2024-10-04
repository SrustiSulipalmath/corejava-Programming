public class NumFormatExce {
    public static void main(String[] args) {
        int i = Integer.parseInt("10");
        int i1 = Integer.parseInt("ten");
    }
}

//trying to convert string to number but string internally not represents number


// Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.parseInt(Integer.java:685)
//         at NumFormatExce.main(NumFormatExce.java:4)
