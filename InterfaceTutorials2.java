interface A{
    void show();
    
}
interface B{
    void show();
}
class display implements A,B{
    public void show(){
        System.out.println("Vanshika");
    }
}

public class InterfaceTutorials2 {
    public static void main(String[] args) {
        display d = new display();
        d.show();
    }
    
}
