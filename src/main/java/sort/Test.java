package sort;

import java.util.Arrays;

/**
 * @Author 喻可
 * @Date 2021/9/29 17:29
 */
public class Test {

    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    // 此次冒泡有数据交换
                    flag = true;
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }

    // 插入排序，a表示数组，n表示数组大小
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) return;
        //i=1因为
        //初始已排序区间只有一个元素，就是数组的第一个元素
        for (int i = 1; i < n; i++) {

            int temp = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 7, 2, 4, 1, 5, 6, 8};
        insertionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

}
