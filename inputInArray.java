import java.util.Scanner;

public class inputInArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=in.nextInt();
        System.out.println("enter elements of array");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }

    }
    
}
