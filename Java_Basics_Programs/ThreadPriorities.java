//Thread Priorities
class MyThread extends Thread{
    int count=0;
    public void run(){
        for(int i=1;i<1000;i++){
            count++;
        }
        System.out.println("Completed Thread: "+Thread.currentThread().getName());
        System.out.println("It's Priority: "+Thread.currentThread().getPriority());
    }
}
public class ThreadPriorities {
    public static void main(String args[]){
     MyThread m=new MyThread();
     Thread t1=new Thread(m,"One");
     Thread t2=new Thread(m,"Two");

     t1.setPriority(Thread.MAX_PRIORITY);
     t2.setPriority(Thread.NORM_PRIORITY);

     t1.start();
     t2.start();
    }
}
//Thread Max Priority is 10
//Thread Min Priority is 1
//Thread Default Priority is 5