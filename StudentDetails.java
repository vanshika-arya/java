class student{
    private 
    String name;
    int marks;
    public void setdetails(String s,int m){
        name=s;
        marks=m;
    }
    public String getdetails(){
        return name;
    }
    public int getmarks(){
        return marks;
    }
    public void print(){
        System.out.println("name " +getdetails());
        System.out.println("Marks "+getmarks());
    } 
}

public class StudentDetails {
    public static void main(String[] args) {
        student s=new student();
        s.setdetails("vanshika", 229);
        s.getdetails();
        s.print();
    }
    
}
