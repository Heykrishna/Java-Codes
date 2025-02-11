public class MyAnotherThread  extends Thread{
    
    public void run(){

        // task for thread 
        for(int i=10; i>=1; i--){
            System.out.println("Value of i is " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }



    public static void main(String[] args) {
        
        MyAnotherThread t = new MyAnotherThread();
        t.start();
    }
}
