
class Atm{
    private int a;
    public void setrupee(int a){
        this.a=a;
    }
    public int getRupee(){
        return a;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Atm am=new Atm();
        am.setrupee(5000);
        System.out.println(am.getRupee());
    }
    
}
