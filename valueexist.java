public class valueexist {
    public static void main(String[] args) {
        int Target=229;
        int arr[]={189,453,721,342};
        for(int i=0; i<arr.length;i++){
            if(arr[i]==Target)
            System.out.println("Element found at index: "+ i);
            return;
        }
        System.out.println("Element not find");
    }
    
}
