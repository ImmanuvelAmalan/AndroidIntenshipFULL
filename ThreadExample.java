package myclass;
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread class..");
    }
}
class ThreadExample implements Runnable{
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        new Thread(new Hello()).start();
        System.out.println("Main thread..");
    }

    @Override
    public void run() {
        System.out.println("Runnable Thread..");
    }
}