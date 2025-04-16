public class maxvaluearr {
    public static void main(String[] args) {
        int arr[] ={23,56,67,85,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);
        
    }
    
}
