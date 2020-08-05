package SelectionSort;

// 选择排序
public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }

    }

    private static <E> void swap(E[] arr, int j, int i) {
        E t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }


    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 6, 7, 1, 9};

        SelectionSort.sort(arr);

        for (int e : arr) {
            System.out.println(e);
        }

    }
}
