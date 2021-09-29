package digui_10;


import java.util.HashMap;

/**
 * 70
 *
 * @Author 喻可
 * @Date 2021/9/29 11:07
 */
public class DiGui {

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        // hasSolvedList可以理解成一个Map，key是n，value是f(n)
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        }

        int ret = f(n - 1) + f(n - 2);
        hashMap.put(n, ret);
        return ret;
    }

    public static void main(String[] args) {
        DiGui queue = new DiGui();
        long l = System.currentTimeMillis();
        int f = queue.f(45);
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l);
        System.out.println(f);
    }
}
