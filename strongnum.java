public class strongnum {
    public static void main(String[] args) {
        int num =2;
        int original=num;
       int sum=0;
        while(num>0){
            int fact=1;
            for(int i=1; i<=num%10;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==original){
            System.out.println("Strong Number");
        }
        else
        System.out.println("not a strong number");
    }
    
}
