class DataClass
{   
int num;
boolean status=false;
synchronized int getNum()
{ 
if(!status)
    try
    {
        wait();
    }
    catch (Exception e)
    {
    }
        System.out.println("Consumer: " +num);
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
        }
        status=false;
        notify();
        return num;
    }
    synchronized int put(int num)
    {
        if (status)
            try
            {
                wait();
            }
            catch (Exception e)
            {}
        this.num=num;
        status=true;
        System.out.println("Producer: "+num);
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {}
        notify();
        return num;
    }
}
class Producer implements Runnable
{
    DataClass t;
    Producer(DataClass t)
    {
        this.t=t;
        new Thread(this,"Producer").start();
    }
    public void run()
    {
        int i = 0;
        while (true)
        {
            t.put(i++);
        }
    }
}
class Consumer implements Runnable
{
    DataClass t;
    Consumer(DataClass t)
    {
        this.t=t;
        new Thread(this,"Consumer").start();
    }
    public void run()
    {while (true)
        {
            t.getNum();
            }
    }
}
class  ProducerConsumer
{
    public static void main(String[] args)
    {
        DataClass t=new DataClass();
        new Producer(t);
        new Consumer(t);
    }
}