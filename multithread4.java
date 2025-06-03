class downloadFile extends Thread{
       String filename;
       public downloadFile (String filename){
              this.filename= filename;
       }
        public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(filename+ " downloding....."+ (i*20)+ "%");
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
    }
        System.out.println(filename + " done");
    }
}

public class multithread4 {
    public static void main(String[] args) {
        downloadFile F1 = new downloadFile("File A");
        downloadFile F2 = new downloadFile("File B");
        F1.start();
        F2.start();

    }

    
}
