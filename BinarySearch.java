public class BinarySearch {
    static void binarySearch(int arr[],int target){
    
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                System.out.println("found at "+ mid);
                return;
            }
            else if(mid>target){
                end=mid-1;
            }
            else
            st=mid+1;

        }
        System.out.println("not found");

    }
    public static void main(String[] args) {
        int arr[]={22,0,24,11,3,5};

        binarySearch(arr, 24);
    }
    
}
