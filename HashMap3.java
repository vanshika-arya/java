import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String ,Integer>map=new HashMap<>();
        String s="programming is a fun and fun is a programming";
       String[] s1=   s.split(" ");
       
        for(String i: s1){
            map.put(i, map.getOrDefault(i, 0)+1);

        }
        System.out.println(map);
    }
}
    