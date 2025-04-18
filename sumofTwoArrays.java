import java.util.Scanner;

public class sumofTwoArrays {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a1[]={4,5,6,7};
        int a2[]={4,5,6,7};
        int s[]=new int[a1.length];
        for(int i=0;i<a1.length;i++){
            s[i]=a1[i]+a2[i];
            System.out.println(s[i]);
        }
    }
}
