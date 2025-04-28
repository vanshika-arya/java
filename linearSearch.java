public class linearSearch {
    static void linearSearch(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.println("found at "+ i);
                return;
            }
            }
            System.out.println("not found");
        }
        public static void main(String[] args) {
            int arr[] = {22,9,0,5,2};
            linearSearch(arr, 3);
        }
    }
    

