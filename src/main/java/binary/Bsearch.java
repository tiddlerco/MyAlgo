package binary;

/**
 * 二分查找的递归实现
 * 有序数组中不存在重复元素
 *
 * @Author 喻可
 * @Date 2021/10/18 10:53
 */
public class Bsearch {

    // 二分查找的递归实现
    public int bsearch(int[] a, int n, int val) {
        return bsearchInternally(a, 0, n - 1, val);
    }

    private int bsearchInternally(int[] a, int low, int high, int value) {
        if (low > high) return -1;

        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] < value) {
            return bsearchInternally(a, mid + 1, high, value);
        } else {
            return bsearchInternally(a, low, mid - 1, value);
        }
    }
}
