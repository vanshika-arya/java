import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uniqueElements {
     public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> unique = list.stream()
                                   .distinct()
                                   .collect(Collectors.toList());

        System.out.println("Unique elements: " + unique);
     }
}
