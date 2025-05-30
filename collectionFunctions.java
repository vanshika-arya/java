import java.util.ArrayList;
import java.util.Collections;

public class collectionFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(27);
        list.add(9);
        list.add(7);
        list.add(13);
       Collections.sort(list);
       System.out.println(list);
       Collections.shuffle(list);
        System.out.println(list);
       Collections.swap(list, 3, 0);
        System.out.println(list);



    }
    
}
