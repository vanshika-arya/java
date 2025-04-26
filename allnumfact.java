import java.util.Scanner;

public class allnumfact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int fact=1;
            for(int j=1; j<=i; j++){
                fact=fact*j;
            }
            System.out.println(i + "! =" + fact);
        }
    } 
    
}
