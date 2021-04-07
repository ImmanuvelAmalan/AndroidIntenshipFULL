class MyThread extends Thread{
    public void run(){
        for (int doc=0;doc<10;doc++){
            System.out.println("Printing doc "+doc+" on printer 2");
        }
    }
}
class ThreadExampleTwo{
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        System.out.println("== Start ==");myThread.start();
        for (int doc=0;doc<10;doc++){
            System.out.println("Printing doc "+doc+" on printer 1");
        }

        System.out.println("== End ==");
    }
}