import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class sumofOddNumbers {
    public static void main(String[] args) {
        List <Integer> list= Arrays.asList(13,30,9,1,6);
        Optional <Integer> sum=list.stream()
                        .filter(n->n%2!=0)
                        .reduce((a,b)->a+b);
         System.out.println(sum);
    }
    
}
