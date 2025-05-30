import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Vanshika");
        list.add("anjali");
        list.add("as");
        list.add("alishifa");
        list.add("Jyoti");
        ListIterator<String> it= list.listIterator();
        while(it.hasNext()){
            String data= it.next();
            
            System.out.println(data);
        }
        System.out.println("Ulta");
        while(it.hasPrevious()){
            String PrevData=it.previous();
            System.out.println(PrevData);
        }
    }
    
}
