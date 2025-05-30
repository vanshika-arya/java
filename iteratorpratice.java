import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratorpratice {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
         list.add("Vanshika");
        list.add("anjali");
        list.add("as");
        list.add("fa");
        list.add("Jyoti");
        Iterator<String> it=list.iterator();
        ListIterator<String> s=list.listIterator();
        while(it.hasNext()){
            String Data=it.next();
            if(Data.length()<3){
                System.out.println(Data);
            }

        }
        
    }
    
}
