public class Person {
    String name;
    int age;
    //constructor
    Person(String n,int a){
         name=n;
         age=a;
    }
    void display(){
        System.out.println("Name "+ name);
        System.out.println("Age "+age);
    }
    public static void main(String[] args) {
        Person p=new Person("Vanshika", 18);
        p.display();
    }
}

