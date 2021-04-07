import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CollectionIterator{
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
                System.out.println(iterator.next());
        }
        iterator.remove();
        System.out.println(list);


    }
}