abstract class shape{
    abstract void area();
    
}
class circle extends shape{
    void area(){
        int radius=3;
        double area=radius*radius*3.14;
        System.out.println(" Area of circle is  "+area );

    }
}
class reactangle extends shape{
    void area(){
        int lenght=3;
        int breadth=4;
        double area=lenght*breadth;
        System.out.println(area);
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
        shape s1=new circle();
        shape s2= new reactangle();
        s1.area();
        s2.area();
        
    }
    
}
