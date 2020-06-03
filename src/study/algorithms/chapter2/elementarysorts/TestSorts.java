package study.algorithms.chapter2.elementarysorts;

import edu.princeton.cs.algs4.In;

/**
 * 测试排序算法
 *
 * java -classpath . study.algorithms.chapter2.elementarysorts.TestSorts < tiny.txt
 * @author zyf
 */
public class TestSorts {
    public static void main(String[] args) {
        String[] a =new In().readAllStrings();
        Sort sort = new Selection();
        sort.sort(a);
        assert Sort.isSorted(a);
        Sort.show(a);
    }
}
