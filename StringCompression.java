public class StringCompression {
    public static void main(String[] args) {
        String str= "aaabbbcc";
        StringBuilder newstr= new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            
            if(str.charAt(i)==str.charAt(i-1))
            count++;
            else{
                newstr.append(str.charAt(i-1)).append(count);
                count=1;
            }
           
        }
        for(int j=0;j<newstr.length();j++){
            System.out.print(newstr.charAt(j));
        }
       
    }
    
}
