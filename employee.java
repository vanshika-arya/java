class Employee_details{
    String name;
    int id;
    double salary;

    void salary_increamennt(double salary){
        
        salary=salary+(salary*0.05);
        System.out.println("Salary after increament: "+ salary);
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}


public class employee {
    public static void main(String[] args) {
        Employee_details E=new Employee_details();
        E.name="Vanshika";
        E.id=229;
        E.salary=34445.99;
        E.display();
        E.salary_increamennt(34445.99);
    }

    
}
