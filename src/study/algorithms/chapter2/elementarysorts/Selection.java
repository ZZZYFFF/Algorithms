package study.algorithms.chapter2.elementarysorts;

/**
 * 选择排序
 *
 * @author zyf
 */
public class Selection implements Sort {
    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (Sort.less(a[j], a[min])) {
                    min = j;
                }
                Sort.exch(a, i, min);
            }
        }
    }
}
