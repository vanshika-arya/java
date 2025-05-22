interface vehicle{
     default void start(){
        System.out.println("Vehicle is starting");
     }
}
class car implements vehicle{
}
 public class tutorial5 {
    public static void main(String[] args) {
        car c= new car();
    c.start();
    }
    
    
}
