class student{
    String firstname="Vanshika";
    String lastname="Arya";
    void fullname(){
        System.out.println(firstname+ " " + lastname);
    }
}


public class classObjIntro {
    
    public static void main(String[] args) {
        student obj=new student();
        obj.fullname();
    }
    
}
