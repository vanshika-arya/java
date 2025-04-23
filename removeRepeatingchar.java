public class removeRepeatingchar {
    public static void main(String[] args) {
        String s="hhlloo";
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]==arr[i+1])
                i++;
        }
    }
    
}
