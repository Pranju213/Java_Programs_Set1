//Program to create MyThread class with run() method and then attach a thread to this MyThread class object.
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
}
class ThreadDemo{
    public static void main(String args[]){
        MyThread obj=new MyThread();
        Thread t=new Thread(obj);
        t.start();
    }
}
