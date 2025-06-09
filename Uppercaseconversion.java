import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercaseconversion {
    public static void main(String[] args) {
       ArrayList <String> list= new ArrayList<>();
       list.add("vanshika");
       list.add("alshifa");
       list.add("Piu");
       List <String> upperCase= list.stream()
                                .filter(b->b.length()>3)
                                .map(b->b.toUpperCase())
                                .collect(Collectors.toList());
                         System.out.println(upperCase);       
    }
    
}
