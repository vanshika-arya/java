class EmployeeDetails{
    private 
    int id;
    String name;
    int salary;
    public void getdetails(int i, String n, int s){
        id=i;
        name=n;
        salary=s;
    }
    public int setid(){
        return id;
    }
    public String setname(){
        return name;
    }
    public int marks(){
        return salary;
    }
    public void print(){
        System.out.println(setid());
        System.out.println(marks());
        System.out.println(setname());
        
    }
}

public class Employee {
    public static void main(String[] args){
        EmployeeDetails e= new EmployeeDetails();
        e.getdetails(229,"vanshika",15000);
        e.setid();
        e.setname();
        e.marks();
        e.print();

    }
    
}
