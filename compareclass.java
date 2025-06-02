import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
    int age;
    int rollN;
    String Name;
    public Student(int age, int rollN, String Name){
        this.age=age;
        this.rollN= rollN;
        this.Name = Name;
    }
    public  String toString(){
        return age+ " "+ Name + " "+ rollN;
    }
}
class sortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.Name.compareTo(s2.Name);
    }
        
    }


public class compareclass {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(12, 229, "Vanshika"));
        list.add(new Student(21, 95, "Alshifa"));
        list.add(new Student(10, 22, "Tejasv"));
        Collections.sort(list,new  sortByName());
        for(Student s: list){
            System.out.println(s);
        }
        
    }
    
}
