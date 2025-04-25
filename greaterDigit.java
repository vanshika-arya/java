public class greaterDigit {
    static int sum(int a, int b){
        return a+b;
    }
    static int max_digit(int c){
        int maxDigit=0;
        while(c>0){
            
            int d=c%10;
            if(maxDigit<d){
                maxDigit=d;
            }
            c=c/10;
            
        }
        return maxDigit;
          
    }
    public static void main(String[] args) {
        int i=sum(21, 10);
        int ans=max_digit(i);
        System.out.println(ans);
        
    }


    }
    

