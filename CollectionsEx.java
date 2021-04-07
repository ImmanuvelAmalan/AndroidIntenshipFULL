import java.io.*;
import java.util.*;
class CollectionsEx{
    public static void main(String[] args){
        // SET
        int[] arr ={24,54,23,87,25,98,21,12};
        int[] arr1 ={20,64,23,87,30,18,29,35};
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){set.add(arr[i]);}
        System.out.println(set);

        // Treeset
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add("Good");
        treeset.add("For");
        treeset.add("Health");
        //Duplicate Element
        treeset.add("Good");
        System.out.println("TreeSet : ");
        for (String temp : treeset) {
            System.out.println(temp);
        }

        // Hashset
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Good");
        hashSet.add("For");
        hashSet.add("Health");
        //Add Duplicate Element
        hashSet.add("Good");
        System.out.println("HashSet: ");
        for (String temp : hashSet) {
            System.out.println(temp);
        }

        // List
        List<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Mango"); // Duplicate element
        list.set(1,"Dates");
        Collections.sort(list);
        for(String fruit:list)
            System.out.println(fruit);
        System.out.println(list.get(1));
        list.set(1,"Dates");         //changing the element

        // Array List
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        // Appending the new elements
        for (int i = 1; i <= 5; i++)
            arrli.add(i);
        System.out.println(arrli);
        arrli.remove(3); // Remove
        System.out.println(arrli);

        // Linked List
        LinkedList<String> object=new LinkedList<String>();
        object.add("A");
        object.add("B");
        object.add("B");
        object.addLast("C");
        System.out.println(object);
        object.remove("B");
        object.removeFirst();
        System.out.println(object);

        // Queue using linked list
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(3);
        numbers.offer(5);
        numbers.offer(1);
        System.out.println("Queue: " + numbers);
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("Updated Queue: " + numbers);

        // Priority Queue
        Queue<Integer> numbers1 = new PriorityQueue<>();
        numbers1.offer(3);
        numbers1.offer(5);
        numbers1.offer(1);
        System.out.println("Queue: " + numbers1);
        int accessedNumber1 = numbers1.peek();
        System.out.println("Accessed Element: " + accessedNumber1);
        int removedNumber1 = numbers1.poll();
        System.out.println("Removed Element: " + removedNumber1);
        System.out.println("Updated Queue: " + numbers1);

        // MAP
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Cricket");
        map.put(2,"Football");
        map.put(3,"Baseball");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // HASHMAP

        HashMap<Integer,String> maps=new HashMap<Integer,String>();//Creating HashMap
        maps.put(1,"Mango");
        maps.put(2,"Apple");
        maps.put(3,"Banana");
        maps.put(4,"Grapes");
        maps.remove(3);
        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : maps.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        

    }
}
