class Thread1 extends Thread{
    int bal=146;
    int amount;
    public Thread1(int b){
        this.amount=b;
    }
    public void run(){
        if(bal>=amount){
            System.out.println("is going withderawl "+ amount);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            bal-=amount;
            System.out.println("Remaining Balance "+ bal);
        }
        else{
            System.out.println("Gareeb ho");
        }

    }
    
public class BankThreadProblem {
    public static void main(String[] args) {
        Thread1 t= new Thread1(800);
        Thread t1= new Thread1(200);
        t.start();
        t1.start();
        
    }
    
}
}
