public class string1 {
    public static void main(String[] args) {
        String s="vanshika";
      System.out.println(s.charAt(0));
      System.out.println(s.charAt(1));
      System.out.println(s.charAt(2));
      System.out.println(s);
      System.out.println(s.length());
      System.out.println(s.indexOf("l"));
      char a[]=s.toCharArray();
      for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
      }
    }
    
}
