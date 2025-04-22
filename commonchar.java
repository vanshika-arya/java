public class commonchar {
    public static void main(String[] args) {
        String s="hello";
        String s1="hiili";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s.charAt(i)==s1.charAt(j)){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
    
}
