class reactangle{
    int length;
    int breadth;
    void area(){
        float area=length*breadth;
        System.out.println(area);
    }
    void perimeter(){
        float perimeter=2*(length+breadth);
        System.out.println(perimeter);
    }
}


public class Rectangle {
    public static void main(String[] args) {
        reactangle r= new reactangle();
        r.length=22;
        r.breadth=23;
        r.area();
        r.perimeter();
    }
    
}
