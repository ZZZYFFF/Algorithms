package study.algorithms.chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author zyf
 */
public class TowSumFast {
    public static int count(int[] a) {
        int n = a.length;
        int cnt = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
