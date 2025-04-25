public class variabletypes {
    int a=12;//instance variable
    static int b=10; //static variable declared with static keyword
    public static void main(String[] args) {
        int c=11;//local variable
        System.out.println(c);//prints the local variable value inside the method where it declared
        variabletypes obj = new variabletypes();
        System.out.println(obj.a);//prints instance variable---> by creating an object
        System.out.println(b);//prints static variable
        System.out.println(variabletypes.b);//prints static variable
    }
    
}
