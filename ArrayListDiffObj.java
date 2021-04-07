package myclass;
import java.util.ArrayList;
class Sample{
}
class Sample2{

}
class ArrayListDiffObj{
    public static void main(String[] args) {
        Sample sample=new Sample();
        Sample2 sample2=new Sample2();
        ArrayList arrayList=new ArrayList();
        ArrayList<Object> arrayList1=new ArrayList<>();
        arrayList.add("HELLO");
        arrayList.add(123);
        arrayList.add('c');
        arrayList.add(sample);
        arrayList.add(sample2);
        arrayList1.addAll(arrayList);
        for (Object i:arrayList) {
            System.out.println(i);
        }
        for (Object i:arrayList1) {
            System.out.println(i);
        }
    }
}