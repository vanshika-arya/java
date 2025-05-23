import java.util.ArrayList;
import java.util.Collections;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList <String> arr= new ArrayList<>();
        arr.add("Vanshika");
        arr.add("Alshifa");
        arr.add(1, "Jyoti");
       /*  for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }*/
        Collections.sort(arr);
        System.out.println(arr);
        }
    }
        
    
    

