import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatList {
    
    public static void main(String[] args) {
           List <String> list= Arrays.asList("Java is fun", "Streams are Powerful");
           List <String> Separate = list.stream()
                                    .flatMap(str->Arrays.stream(str.split(" ")))
                                    .collect(Collectors.toList());
                      System.out.println(Separate);              

       
    }
}
