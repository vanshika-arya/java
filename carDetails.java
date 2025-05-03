class Car{
    String brand;
    String model;
    long price;

    void dispaly(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}


public class carDetails {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.brand="Audi";
        c1.model="as34";
        c1.price=1006784;
        c1.dispaly();
        Car c2= new Car();
        c2.brand= "Wegnor";
        c2.model= "1.2ZXi+";
        c2.price= 123009;
        c2.dispaly();
    }
    
}
