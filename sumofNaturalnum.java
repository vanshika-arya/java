public class sumofNaturalnum {
    static void sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(9);
    }
    
}
