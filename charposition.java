public class charposition {
    public static void main(String[] args) {
        String name= "Vanshika";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(6));
        //replace
        String newname=name.replace('s','m');
        System.out.println(newname);
        //substring
        System.out.println(name.substring(0, 8));
    }
    
}
