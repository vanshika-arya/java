public class reversefact {
    public static void main(String[] args) {
        int num=120;
        for(int i=1;i<=num/2;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
            fact=fact*j;
            }
            if(fact==num){
            System.out.println(num + " = " + i+ "!");
            return;
            }
        
        }
        System.out.println("not factorial of any number");
    }
    
}
