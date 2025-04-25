public class SumOfDigitsusingMethod {
    static void sumofdigits(int a){//Parameter
        int sum=0;
        while(a>0){
        sum=sum+a%10;
        a=a/10;
       
    }
    System.out.println(sum);
}
static int sum(int a,int b){
    return a+b;
}
public static void main(String[] args) {
    sumofdigits(123);//Argument
    int s= sum(4,6);
    System.out.println(s);
    
}
    

    
}
