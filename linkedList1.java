import java.util.LinkedList;
public class linkedList1{
    public static void main(String[] args) {
        LinkedList<Integer> arr= new LinkedList<>();
        long start=System.nanoTime();
        arr.add(23);
        arr.add(54);
        arr.add(11);
        System.out.println(arr.get(0));
        System.out.println(arr.contains(34));
        System.out.println(arr.contains(11));
        System.out.println(arr.remove(0));
        System.out.println(arr);
        long end = System.nanoTime();
        System.out.println(end-start);       
    }
    
}
