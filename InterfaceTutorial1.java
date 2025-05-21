interface Wakable{
    void walk();
    void run();
}
interface Runnable{
    void walk();
    void run();
}
class Human implements Wakable,Runnable{
    public void walk(){
        System.out.println("vanshika can walk");
    }
    public void run(){
        System.out.println("Vanshika can run fast");
    }
}


public class InterfaceTutorial1 {
    public static void main(String[] args) {
      Human H=new Human();
        H.walk();
        H.run();
    }
    
}
