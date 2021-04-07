class Sample{
    public void finalize(){
        System.out.println("Garbage Collected");
    }
}
class GarbageCollection{

    public static void main(String[] args) {
    Sample sample=new Sample();
    Sample sample1=new Sample();
    sample=null;
    sample1=null;
    System.gc();

            }
}