
// 从简单的线性查找开始
public class LinearSearch {
    public int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        LinearSearch ls = new LinearSearch();

        int res = ls.search(data, 3);

        System.out.println(res);
    }
}
