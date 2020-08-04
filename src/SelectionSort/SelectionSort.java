package SelectionSort;

public class SelectionSort {
    private SelectionSort() {
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }

    }

    private static void swap(int[] arr, int j, int i) {
        int t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }


    public static void main(String[] args) {
        int[] arr = {4,5,3,1,6,7,1,9};

        SelectionSort.sort(arr);

        for (int e: arr) {
            System.out.println(e);
        }


    }
}
