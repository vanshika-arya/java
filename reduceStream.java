import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class reduceStream {
    public static void main(String[] args) {
         List <Integer> list= Arrays.asList(10,30,87,6);
        Optional <Integer> sum=list.stream().reduce((a,b)->a+b);
                               
                  System.out.println(sum);
    }
    
}
