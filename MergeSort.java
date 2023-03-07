import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {

    public static void main(String[] args) {

        Integer[] arr = {22, 66, 58, 7, 12, 97, 17};

        MergeSort<Integer> mergeSort = new MergeSort<>();

        mergeSort.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

 

    public void sort(T[] arr) {

        mergeSort(arr, 0, arr.length - 1);

    }

 

    private void mergeSort(T[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);

            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);

        }

    }

 

    private void merge(T[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;

        int n2 = right - mid;

 

        T[] L = (T[]) new Comparable[n1];

        T[] R = (T[]) new Comparable[n2];

 

        for (int i = 0; i < n1; i++) {

            L[i] = arr[left + i];

        }

        for (int j = 0; j < n2; j++) {

            R[j] = arr[mid + 1 + j];

        }

 

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (L[i].compareTo(R[j]) <= 0) {

                arr[k] = L[i];

                i++;

            } else {

                arr[k] = R[j];

                j++;

            }

            k++;

        }

 

        while (i < n1) {

            arr[k] = L[i];

            i++;

            k++;

        }

 

        while (j < n2) {

            arr[k] = R[j];

            j++;

            k++;

        }

    }

}