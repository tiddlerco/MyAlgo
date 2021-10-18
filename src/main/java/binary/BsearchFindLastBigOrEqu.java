package binary;

/**
 * 查找第一个大于等于给定值的元素
 *
 * @Author 喻可
 * @Date 2021/10/18 15:42
 */
public class BsearchFindLastBigOrEqu {


    public static int bsearch(int[] a, int n, int value) {

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                if ((mid == n - 1) || (a[mid + 1] > value)) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrays = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};

        int bsearch = bsearch(arrays, arrays.length, 8);

        System.out.println(bsearch);
    }
}
