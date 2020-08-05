package InsertionSort;

import SelectionSort.SelectionSort;

// 插入排序
public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // 将 arr[i] 插入到合适的位置

            // 优化，减少数组寻址次数
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    private static <E> void swap(E[] arr, int j, int i) {
        E t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 6, 7, 1, 9};

        InsertionSort.sort(arr);

        for (int e : arr) {
            System.out.println(e);
        }
    }
}
