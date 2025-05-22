public class MaximumSubarraySum {
    public static void main(String[] args) {
        int arr[]={22,-4,-7,1,5,8};
        try {
            for(int i=0;i<arr.length;i++){
            int maxSum=0;
            int original=maxSum;
            for(int j=i+1;j<arr.length;j++){
               
                maxSum+=arr[j];
            }
            if(maxSum>original){
               System.out.println(maxSum);
            }
        
            
        } 
    }  
    catch (Exception e) {
            System.out.println("Array index out of bound");
        } 
        System.out.println("vanshika");
    
}
}

