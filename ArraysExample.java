
import java.util.Arrays;

class ArraysExample {
    public static int min(int[] n) { // passing array to method
        int temp = n[0];
        for (int i : n) {
            if (temp < i) {
                continue;
            } else {
                temp = i;
            }
        }
        return temp;
    }

    public static int[] ret() { // Retruning array from method
        return new int[]{5645, 654, 564, 54, 6, 587};
    }

    public static void main(String[] args) {
        int number[] = {2, 3, 4, 5, 6, 7, 1, 8, 9, 0}; // Single D array
        int number2[] = {2,3, 4, 5, 6, 7, 1, 8, 9, 0};
        for (int i : number) {
            System.out.println(i); // printing using foreach loop
        }
        System.out.println("Min: " + min(number));
        System.out.println("Min: " + min(new int[]{12, 235, 12, 56, 13, 76, 13})); // Anonymous Array
        System.out.println("Length: " + number.length); // length of array
        for (int j : ret()) {
            System.out.print(j + " ");
        }
        System.out.println();
        int arr[][][] = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}}}; // Multi D array
        for (int k[][] : arr) {
            for (int l[] : k) {
                for (int m : l) {
                    System.out.print(m + " ");
                } } }
        System.out.println();
        int arr2[][]={{1,2,3},{4,5},{6,7,8,9,10}}; // Jagged array
        System.out.println(String.valueOf(arr2.getClass().getName()));  // Array proxy Class
        char[] arr3={'a','b','c','d','e','f'};
        char[] copyOfArr3;
        System.arraycopy(arr3,0,arr3,0,arr3.length); // Array Copying
        char[] cloneOfArr3=arr3.clone(); // Array Cloning
        for (char n:cloneOfArr3)
        {
            System.out.print(n+" ");
        }
        System.out.println();
       
    }
}
