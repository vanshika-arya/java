import java.util.ArrayList;
public class ArrayList2 {
   

    public static void main(String[] args) {
       ArrayList <String> arr= new ArrayList<>();
        arr.add("Vanshika");
        arr.add("Alshifa");
        arr.add(0, " Jyoti");
        System.out.println(arr);
        
        try{
        System.out.println(arr.get(4));
        }catch(Exception e){
            System.out.println("array index out of bound");
        }finally{
       arr.add(3, "Rashmi");
        System.out.println(arr.get(3));
        arr.remove(3);
        System.out.println(arr);
        }
    }
    
}


