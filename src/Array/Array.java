package Array;

// 实现一个动态数组
public class Array {

    private int[] data;
    private int size;

    // 构造函数
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 无参构造函数
    public Array() {
        this(10);
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在最後添加一個元素
    public void addLast(int e) {
        if (data.length <= size) {
            throw new IllegalArgumentException("Addlast failed. Array is full");
        }

        data[size] = e;
        size ++;
    }

    public void add(int index, int e) {
        if (data.length <= size) {
            throw new IllegalArgumentException("Add failed. Array is full");
        }

        if (index < 0 || index >= data.length) {

        }


    }

}
