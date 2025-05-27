import java.util.HashSet;
import java.util.TreeSet;
public class set {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        int a[]={1,2,2,42,4,5,3,53,45,3,5};
       for(int i=0;i<a.length;i++){
        set.add(a[i]);
    
       }
       System.out.println(set);
    }
    
}
