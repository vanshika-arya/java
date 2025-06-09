import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordstoTheirLength {
    public static void main(String[] args) {
        ArrayList <String> list= new ArrayList<>();
       list.add("vanshika");
       list.add("alshifa");
       list.add("Piu");
       List <Integer> wordLength= list.stream()
                                .map(a->a.length())
                                .collect(Collectors.toList()); 
                                System.out.println(wordLength);  
    }
    
}
