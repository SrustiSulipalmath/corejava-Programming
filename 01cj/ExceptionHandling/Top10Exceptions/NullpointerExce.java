public class NullpointerExce {
    public static void main(String[] args) {
        String s = "Srusti";
        System.out.println(s.length());
        String s1=null;
        System.out.println(s1.length());
    }
}
//trying to perform any operation on null reference