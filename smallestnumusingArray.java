public class smallestnumusingArray {
    static void min_num(int a[], int n){
       int smallest=0;
        for(int i=0; i<n;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println(smallest);

    }
    public static void main(String[] args) {
        int a[]={-2,45,12,9};
        min_num(a,a.length);
    }
    
}
