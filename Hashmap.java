import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> map= new HashMap<>();
       map.put("id1", 2);
        map.put("id2", 4);
         map.put("id3", 3);
         System.out.println(map.get("id2"));
         System.out.println(map);
    }
    
}
