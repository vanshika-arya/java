public class evenNumrange {
    static void evennum(int a, int b){
        for(int i=a;i<=b;i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        evennum(7, 15);
    }
    
}
