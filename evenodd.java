import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("size of array: ");
        int n= in.nextInt();
        int even=0, odd=0;
        int[] arr= new int[n];
        System.out.println("enter elements of Array: ");
        for(int i=0;i<n;i++){
           arr[i] = in.nextInt();
           if(arr[i]%2==0){
           even++;
           }
           else
           odd++;
        }
        System.out.println("Even= " + even + " Odd= " + odd);

    }
    
}
