import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Wnter a number ");
        int num= sc.nextInt();
        int original=num;
        int result=0;
        while(num>0){
            int digit=num%10;
            result+=digit*digit*digit;
            num/=10;
        }
        if(result==original){
            System.out.println("Armstrong Number");
        }
        else
        System.out.println("Not an armstrong number");
    }
    
}
