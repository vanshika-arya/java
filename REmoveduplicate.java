import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class REmoveduplicate {
    
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(999, 1000, 1500, 1000, 2000);
         Optional <Integer> sum=list.stream().distinct()
                                            .filter(a->a>1000)
                                             .reduce((a,b)->a+b);
                System.out.println(sum);
                               
                  

    }
}
