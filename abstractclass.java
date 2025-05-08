abstract class payment{
    abstract void pay(int a);
    void print(){
        System.out.println("payment done");
    }
}
class UPIPayment extends payment{
    void pay(int a){
        System.out.println(a + " Payment done via UPI");
    }
}
class cardPayment extends payment{
    void pay(int a){
        System.out.println(a + "done via card");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        payment obj1=new UPIPayment();
        payment obj2= new cardPayment();
        obj1.print();
        obj1.pay(1000);
        obj2.pay(12000);
        obj2.print();
        
    }
    
}
