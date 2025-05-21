interface Animal{
    void makesound();
}
class Dog implements Animal{
    public void makesound(){
        System.out.println("Barks");
    }
}

    

public class InterfaceTutorial3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makesound();
    }
    
}
