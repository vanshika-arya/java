public class mostRepeatedChar {
    public static void main(String[] args) {
        String s="hhellloeewwwwwo";
        char mostfreqchar='a';
        char arr[]=s.toCharArray();
        int max=0;
       
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(max<count){
                    max=count;
                    mostfreqchar=arr[i];
                }
            }
            
            
        }
        System.out.println(mostfreqchar);
    }
    
}
