public class comparearrays {
    public static void main(String[] args) {
        int[] arr1={2,8,5,3};
        int[] arr2={2,8,6,3};
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("arrays are not same");
                return;
            }
        }
        System.out.println("same arrays");
        
    }
    
}
