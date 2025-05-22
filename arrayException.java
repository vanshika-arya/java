public class arrayException {
    public static void main(String[] args) {
        int arr[]={1,3,6,7};
        try{
            System.out.println(arr[6]);
        }catch(Exception e){
            System.out.println("can't access index 6 bcz length of array is 4");
        }
    }
    
}
