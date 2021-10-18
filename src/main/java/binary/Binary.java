package binary;

/**
 * 二分法最简单的情况:有序数组中不存在重复元素
 *
 * @Author 喻可
 * @Date 2021/10/18 10:53
 */
public class Binary {

    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
