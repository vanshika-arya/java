interface Shape{
 void    Area();
}
class Circle implements Shape{
    int r=1;
    public void Area(){
        System.out.println(3.14*r*r);
    }
}

public class Tutorial4{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.Area();
    }
    
}
