public class RunThread implements Runnable{
 
    public static int myCount = 0;
    public RunThread(){
         
    }
    public void run() {
        while(RunThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++RunThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        RunThread rt = new RunThread();
        Thread mt = new Thread(rt);
        mt.start();
        while(RunThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++RunThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
