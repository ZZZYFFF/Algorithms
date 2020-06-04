package study.algorithms.chapter2.elementarysorts;

/**
 * 插入排序
 *
 * @author zyf
 */
public class Insertion implements Sort {
    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && Sort.less(a[j], a[j - 1]); j--) {
                Sort.exch(a, j, j - 1);
            }
        }
    }
}
