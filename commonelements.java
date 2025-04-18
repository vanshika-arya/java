public class commonelements {
    public static void main(String[] args) {
        int[] a1={3,5,8,6,2};
        int a2[]={5,2,7,4,8};
        for(int i=0;i<a1.length;i++){
           for(int j=0;j<a2.length;j++){
            if(a1[i]==a2[j]){
                System.out.print(a1[i]+ " ");
            }
           }
        }
    }
    
}
