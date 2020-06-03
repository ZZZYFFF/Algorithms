package study.algorithms.chapter2.elementarysorts;

import edu.princeton.cs.algs4.StdOut;

/**
 * sort接口，排序算都需要实现此接口
 *
 * @author zyf
 */
public interface Sort<C> {
    void sort(Comparable[] a);

    /**
     * 比较两个Comparable对象的大小
     *
     * @param v 第一个Comparable对象
     * @param w 第二个Comparable对象
     * @return false--> v>w,true-->v<w
     */
    static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 打印数组
     *
     * @param a 排序的数组对象
     */
    static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            StdOut.print(comparable + " ");
        }
        StdOut.println();
    }

    /**
     * 交换i，j的位置
     *
     * @param a 数组
     * @param i i
     * @param j j
     */
    static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 判断是否有序
     *
     * @param a 数组
     * @return
     */
    static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }
}
