abstract class pet{
    abstract void sound();
}
class dog extends pet{
    void sound(){
        System.out.println("Bow Wow");
    }
}
class cat extends pet{
    void sound(){
        System.out.println("Meow");
    }
}
    


public class animal {
    public static void main(String[] args) {
        pet p1=new cat();
        pet p2=new dog();
        p1.sound();
        p2.sound();
    }
    
}
