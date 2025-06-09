import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class divisibleBySeven {
    public static void main(String[] args) {
         List <Integer> list= Arrays.asList(13,28,9,1,6);
       boolean check=list.stream()
                    .anyMatch(a->a%7==0);
                    System.out.println(check);
    }
    
}
