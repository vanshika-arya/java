public class DuplicateNumber {
    public static void main(String[] args) {
         int[] arr = {1, 3, 2, 3, 4, 1, 5, 2};

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; 
                }
            }
        }
    }
    
}
