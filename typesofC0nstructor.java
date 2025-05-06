class chaining{
    int a;
    chaining(){
        System.out.println("kkpncc");
    }
    chaining(int a){
        this();
        System.out.println(a);
    }
    chaining(int a, int b){
        this(a);
                System.out.println(a+b);
    }
}



public class typesofC0nstructor {
    public static void main(String[] args) {
        chaining c=new chaining(7,3);
    

    }
    
}
