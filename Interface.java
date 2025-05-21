interface Client{
    void print();
    void show();
}
class Dev implements Client{
    public
    void print(){
        System.out.println("Vanshika");
    }
   public  void show(){
        System.out.println("arya");
    }
}

public class Interface {
    public static void main(String[] args) {
        Client c= new Dev();
        c.print();
        c.show();
    }
    
}
