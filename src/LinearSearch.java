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
        Integer[] data = ArrayGenerator.generatorOrderedArray(10000000);

        long start = System.nanoTime();
        int res = LinearSearch.search(data, 100000000);
        System.out.println((System.nanoTime() - start)/1000000000.0);
        System.out.println(res);


//        int res2 = LinearSearch.search(data, 10);
//        System.out.println(res2);
//
//        Student[] students = {new Student("Leo"), new Student("Xiang"), new Student("Tom")};
//
//        Student leo = new Student("leo");
//
//        int res3  = LinearSearch.search(students, leo);
//
//        System.out.println(res3);
    }
}
