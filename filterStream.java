
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class filterStream {
    public static void main(String[] args) {
        //filter= conditions ke bases pe kam ho
        //map= conditions + loop
        List <Integer> list= Arrays.asList(10,30,87,6);
        List <Integer> evenlist=list.stream()
                                .filter(n-> n%2==0)
                                .collect(Collectors.toList());
                  System.out.println(evenlist);              
    }
    
}
