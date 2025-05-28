import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer ,Integer> map= new HashMap<>();
       map.put(5, 2);
        map.put(6, 4);
         map.put(2, 3);
         System.out.println(map.get("id2"));
         System.out.println(map);
         System.out.println(map.containsKey("id5"));
         System.out.println(map.containsValue(5));
         map.forEach((key, value)->{
            if(value==4)
            System.out.println(key);
         });
    }
    
}
