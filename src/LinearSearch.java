// 从简单的线性查找开始
public class LinearSearch {
    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int res = LinearSearch.search(data, 3);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 10);
        System.out.println(res2);
    }
}
