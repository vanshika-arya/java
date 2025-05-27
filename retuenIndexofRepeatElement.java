import java.util.HashSet;

public class retuenIndexofRepeatElement {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
         int a[]={1,2,2,42,4,5,3,53,45,3,5};
       for(int i=0;i<a.length;i++){
        set.add(a[i]);
        int count=0;
         for(int j=0;j<a.length;j++){
            if(a[i]==a[j])
             count++;
            
           
         }
         System.out.println(a[i] + ": "+count);
       }

       System.out.println(set);
    }
    
}
