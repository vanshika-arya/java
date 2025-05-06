class main{
    int a;
    void display(){
     System.out.println(this);
    }
}
class constructor{
    int age=12;
    void display(int age){
        this.age=age;
        System.out.println(age);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        main obj= new main();
        System.out.println(obj);
        obj.display();
        constructor c= new constructor();
        c.display(23);

    }
    
}
