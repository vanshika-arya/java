public class arrayindex {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
    
        for(int i=0; i<arr1.length; i++){
            int sum=0;
            for(int j=0; j<=i; j++){
                sum=arr1[i]+arr2[j];

            }
            System.out.println(sum);
        }
    }
    
}
