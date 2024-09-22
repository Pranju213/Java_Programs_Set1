//Program to show execution of multiple tasks with a single thread
class MyThread implements Runnable{
    public void run(){
        task1();
        task2();
        task3();
    }
    void task1(){
        System.out.println("This is task 1");
    }
    void task2(){
        System.out.println("This is task 2");
    }
    void task3(){
        System.out.println("This is task 3");
    }
}
public class MyThreadDemo2 {
    public static void main(String args[]){
        MyThread m1=new MyThread();
        Thread t=new Thread(m1);
        t.start();
    }
    
}
