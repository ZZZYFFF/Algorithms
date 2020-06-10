package study.algorithms.chapter2.elementarysorts;

/**
 * 希尔排序
 *
 * @author zyf
 */
public class Shell implements Sort {
    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h < (n / 3)) {
            //1,4,13,40,121
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && Sort.less(a[j], a[j - h]); j--) {
                    Sort.exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
