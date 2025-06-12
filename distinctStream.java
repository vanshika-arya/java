import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctStream {
    public static void main(String[] args) {
       List <Integer> list= Arrays.asList(10,20,4,65,4,23,4,10,20,9);
       List<Integer> uniquelist=list.stream().distinct().collect(Collectors.toList());
       System.out.println(uniquelist);  
       };
    }
    
