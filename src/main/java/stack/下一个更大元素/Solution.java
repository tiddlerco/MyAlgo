package stack.下一个更大元素;

/**
 * @Author 喻可
 * @Date 2021/9/28 15:11
 */

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] res = new int[len1];
        if (len1 < 1) {
            return res;
        }

        for (int i = 0; i < len1; i++) {
            int curVal = nums1[i];
            int j = 0;
            while (j < len2 && nums2[j] != curVal) {
                j++;
            }

            // 此时 nums[j] = nums[i]
            j++;
            //继续向后遍历找到比curVal大的值
            while (j < len2 && nums2[j] < curVal) {
                j++;
            }
            //跳出while的两种情况
            //情况1：j == len2
            if (j == len2) {
                res[i] = -1;
                continue;
            }
            //情况2：nums2[j] > curVal
            res[i] = nums2[j];
        }
        return res;
    }
}
