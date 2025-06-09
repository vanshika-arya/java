import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class startWithA {
    public static void main(String[] args) {
        ArrayList <String> list= new ArrayList<>();
       list.add("vanshika");
       list.add("alshifa");
       list.add("Piu");
       List <Integer> countn= list.stream()
                                .filter(a->a.charAt(0)=='A')
                                .count()
    
                                 
    }
    
}
