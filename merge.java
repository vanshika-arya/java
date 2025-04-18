import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] a1={1,2,3,4};
        int[] a2={5,6,7,8};
        int a3[]= new int[a1.length+a2.length];
        for(int i=0; i<a1.length;i++){
               a3[i]=a1[i]; 
        }
        for(int j=0;j<a2.length;j++){
            a3[j+a1.length]=a2[j];
        }
        for(int k=0;k<a3.length;k++){
            System.out.println(a3[k]);
        }
    }
    
}
