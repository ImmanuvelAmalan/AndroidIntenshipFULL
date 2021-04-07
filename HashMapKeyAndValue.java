import java.util.*;
class HashMapKeyAndValue{
    public static void main(String[] args) {
        HashMap list=new HashMap();
        list.put(1,"Cricket");
        list.put(2,"Football");
        list.put(3,"Baseball");
        System.out.println(list);
        System.out.println(list.keySet());
        System.out.println(list.values());

    }
}