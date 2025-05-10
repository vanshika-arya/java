class tempConvert{
     private double celsius;
     public void settemp(int  c){
        celsius=c;
     }
     public double fahrenheit(){
        double f=(celsius*(float)(9/5))+32;
       
        return f;
     }
    
     }



public class celsius {
    public static void main(String[] args) {
        tempConvert c= new tempConvert();
        c.settemp(30);
       System.out.println(c.fahrenheit()); 

    }
    
}
