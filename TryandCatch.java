import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a and b");
       int a= sc.nextInt();
       int b= sc.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Can't divide by Zero");
        }
        System.out.println("hii");
        System.out.println("vanshika");
    }
    
}
