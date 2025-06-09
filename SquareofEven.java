import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SquareofEven {
    public static void main(String[] args) {
         List <Integer> list= Arrays.asList(2,10,30,87,6);
                 List <Integer> evenlist=list.stream()
                                .filter(n-> n%2==0)
                                .map(n->n*n)
                                .collect(Collectors.toList());
       System.out.println(evenlist);
    }
 }
    
    

