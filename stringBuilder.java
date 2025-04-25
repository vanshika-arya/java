public class stringBuilder {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder(13);
       str.append("hello hii vanshika arya");
       System.out.println(str.length());
       System.out.println(str.capacity());
       //if capacity of string exceed than tha capacity defined.
       //capacity=(old capacity)*2+2;
      
    }
    
}
