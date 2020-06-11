package study.algorithms.chapter2.mergesort;

import study.algorithms.chapter2.elementarysorts.Sort;

/**
 * 归并排序
 *
 * @author zyf
 */
public class Merge implements Sort {
    /**
     * 归并所需的辅助数组
     */
    public static Comparable[] aux;

    @Override
    public void sort(Comparable[] a) {

    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[k];
            } else if (Sort.less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

}
