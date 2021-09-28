package stack.比较含退格的字符串;

/**
 * 844
 * @Author 喻可
 * @Date 2021/9/28 10:33
 */
public class Solution2 {

    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    //i--就表示退格指针朝前移动一位
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else {
                // (i >= 0 && j >= 0) 为 false 情况为
                // 1. i < 0 && j >= 0
                // 2. j < 0 && i >= 0
                // 3. i < 0 && j < 0
                // 其中，第 3 种情况为符合题意情况，因为这种情况下 s 和 t 都是 index = 0 的位置为 '#' 而这种情况下
                // 退格空字符即为空字符，也符合题意，应当返回 True。
                // 但是，情况 1 和 2 不符合题意，因为 s 和 t 其中一个是在 index >= 0 处找到了待比较字符，另一个没有找到
                // 这种情况显然不符合题意，应当返回 False，下式便处理这种情况。
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        String str1="a#b#c"; //ab#c true
        String str2="ad#c";

        boolean b = solution2.backspaceCompare(str1, str2);
        System.out.println(b);

    }


}
