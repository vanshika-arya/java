import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Vanshika");
        list.add("anjali");
        list.add("astha");
        list.add("alishifa");
        list.add("Jyoti");
        System.out.println(list);
        Iterator<String> s=list.iterator();
        while(s.hasNext()){
            String data= s.next(); 
            if(data.startsWith("a")){
                s.remove();
            }
        }
        System.out.println(list);
    }
    
}
