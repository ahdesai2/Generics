import java.util.ArrayList;
import java.util.Random;

public class Sort {
    public static int[] createRandomArray(int arrayLength) {

        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }


    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

public static void bubbleSort(int[] a){
    for (int i = a.length; i > i; i --){
        for (int j = 0; j < i - 1; j ++){
            if (a[j] > a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
}
//generic bubble sort
   public static <E> void bubbleSort(ArrayList<E> a){
    for (int i = a.size(); i > 1; i --){
        for (int j = 0; j < i - 1; j ++){
            if (((String) a.get(j)).compareTo((String) a.get(j+1)) > 0){
                E temp = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, temp);
            }
        }
    }
   }

 

    public static void main(String[] args) throws Exception {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 10; i ++){
        arrayList.add(random.nextInt());
    }
    System.out.println(arrayList.toString());
    bubbleSort(arrayList);
    System.out.println(arrayList.toString());
    
    
    
    
    
    
        /*   int arrayLength = 10_000;
        int[] array = createRandomArray(arrayLength);
        long start_time, time_spent;
        start_time = System.currentTimeMillis();
        System.out.println("Before sorting, isSorted(array): " + isSorted(array));
        mergeSort(array);
        time_spent = System.currentTimeMillis() - start_time;
        System.out.println("Merge sort time: " + time_spent + " ms");*/
       // System.out.println("Before sorting, isSorted(array): " + isSorted(array));
      //  System.out.println("After sorting, isSorted(array): " + isSorted(array));
       // time_spent = System.currentTimeMillis() - start_time;

        // System.out.println("Hello, World!");
    }
}