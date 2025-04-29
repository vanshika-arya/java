public class productofNaturalNum {
    static void product(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        System.out.println(product);
    }
    public static void main(String[] args) {
        product(8);
        
    }
    
}
