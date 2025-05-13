import java.util.Scanner;

public class SumOfFabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n= sc.nextInt();
        int a=0,b=1;
        int sum=a+b;
        for(int i=2;i<n;i++){
            int next=a+b;
            sum=sum+next;
            a=b;
            b=next;
        }
        System.out.println("Sum is : "+sum);
    }
    
}
