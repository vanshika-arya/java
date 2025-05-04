class Circle_area{
    float radius;

    void area(float r){
        float area=(float)(3.14*r*r);
        System.out.println(area);


    }
}


public class circle {
    public static void main(String[] args) {
        Circle_area c=new Circle_area();
        c.area(23.6f);
        
    }
    
}
