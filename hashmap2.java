import java.util.HashMap;

public class hashmap2 {
    public static void main(String[] args) {
        HashMap<Character ,Integer> map =new HashMap<>();
       String s="programming";
       char[] ch=s.toCharArray();
       for(char i: ch){
        map.put(i, map.getOrDefault(i,0)+1);
       }
       System.out.println(map);
        
       }
    }
    

