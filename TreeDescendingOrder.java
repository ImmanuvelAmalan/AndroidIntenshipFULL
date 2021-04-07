
import java.util.*;

class TreeDescendingOrder{
    public static void main(String[] args) {
        TreeSet list=new TreeSet();
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("Z");
        list.add("E");
        list.add("D");
        System.out.println(list);
        NavigableSet navigableSet=list.descendingSet();
        System.out.println(navigableSet);


    }
}