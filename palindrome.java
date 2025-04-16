public class palindrome {
    public static void main(String[] args) {
        int a=121;
        int res=0;
        int original=a;
        while(a>0){
            int digit=a%10;
            res=res*10+digit;
            a=a/10;
        }
        if(original==res){
            System.out.println("Palindrome");

        }
        else
        System.out.println("Not a palindrome");
    }
    
}
