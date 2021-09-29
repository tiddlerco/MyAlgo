package digui_10;

/**
 * 70
 *
 * @Author 喻可
 * @Date 2021/9/29 14:29
 */
public class DieDai {

    public int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int ret = 0;
        int pre = 2;
        int prepre = 1;
        for (int i = 3; i <= n; ++i) {
            ret = pre + prepre;
            prepre = pre;
            pre = ret;
        }

        return ret;
    }

    public static void main(String[] args) {
        DieDai dieDai = new DieDai();
        long l = System.currentTimeMillis();
        int f = dieDai.f(45);
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l);
        System.out.println(f);
    }


}
