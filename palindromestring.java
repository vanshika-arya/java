public class palindromestring {
    public static void main(String[] args) {
        String str="Vanshika";
        int j=str.length()-1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("not a palindrome");
                return;
            }
            j--;
        }
        System.out.println("palindrome");
    }
    
}
