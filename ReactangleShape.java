class Reactangle{
    private 
    int length;
    int breadth;
    public void setdetails(int l, int b){
        length=l;
        breadth=b;
    }
    public int getarea(){
        return (length*breadth);
    }
    public int perimeter(){
        return (2*(length+breadth));
    }
}

public class ReactangleShape {
    public static void main(String[] args) {
        Reactangle R= new Reactangle();
        R.setdetails(12, 14);
       System.out.println(R.getarea());
       System.out.println(R.perimeter());
        
    }
    
}
