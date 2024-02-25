class SIM{}
class SDCard{}

class Mobile {
    static void noofSIMs(int sims){}
    void noofSDCards(int cards){}
    
    static void insertSIM(SIM sim){}
    void insertSDCard(SDCard card){}
    
} 

class Customer{
    public static void main(String[] args){
     
     Mobile..noofSIMs(2);
     Mobile.insertSIM(new SIM());
     
     Mobile m1 = new Mobile();
     m1.noofSDCards(1);
     m1.insertSDCard(new SDCard());
    }
}




//when you find class as a parameter then you should pass object as argument
//class value is object