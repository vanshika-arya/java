public class SumOfDigitsusingMethod {
    static void sumofdigits(int a){
        int sum=0;
        while(a>0){
        sum=sum+a%10;
        a=a/10;
       
    }
    System.out.println(sum);
}
public static void main(String[] args) {
    sumofdigits(123);
}
    

    
}
