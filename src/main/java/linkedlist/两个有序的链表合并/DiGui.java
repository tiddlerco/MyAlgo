package linkedlist.两个有序的链表合并;

/**
 * @Author 喻可
 * @Date 2021/9/26 18:42
 */
public class DiGui {
    //使用递归实现 求 1 ~ n 的和
    public static int getSum(int n) {
        if (n == 4) {
            //满足条件，结束递归
            System.out.println("n = " + n);
            return 1;
        }
        System.out.println("递归前n = " + n);
        int temp = getSum(n + 1);
        System.out.println("递归后n = " + n);
        return temp + n;
    }

    public static void main(String[] arge) {
        //调用递归方法，获取 1 ~ n 的和
        int sum = getSum(1);
        //打印结果
        System.out.println("sum = " + sum);
    }
}