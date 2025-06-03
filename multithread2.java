class MyThread extends Thread{
    public void run(){
        System.out.println("hii");
        try{
            Thread.sleep(5000);
        }catch(Exception e){
           
        } System.out.println("hii");
    }
}
public class multithread2 {
    public static void main(String[] args) {
        MyThread t2= new MyThread();
        t2.start();

    }
}
