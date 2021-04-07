
class Print{
    public void printDoc(int numOf,String name){
        for (int i=1;i<=numOf;i++){
            System.out.println("Printing: "+name+" Copy: "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ComputerOne extends Thread{
    Print o;
    ComputerOne(Print o){
        this.o=o;
    }
    public void run(){
        o.printDoc(10,"Immanuvel.pdf");
    }
}
class ComputerTwo extends Thread{
    Print o;
    ComputerTwo(Print o){
        this.o=o;
    }
    public void run(){
        o.printDoc(20,"Amalan.pdf");
    }
}
class MultithreadingExample{
    public static void main(String[] args) throws InterruptedException {
        Print p=new Print();
        ComputerOne pr=new ComputerOne(p);pr.start();// pr.join(); // Join
        new ComputerTwo(p).start();
    }
}