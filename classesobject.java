class student{
    int rollno;
    int age;
    void print(){
        System.out.println(this.rollno);
        System.out.println(this.age);
    }

}



public class classesobject {
    public static void main(String[] args) {
        student s=new student();
        s.rollno=229;
        s.age=18;
        s.print();
        
    }
    
}
