package study.algorithms.chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author zyf
 */
public class StaticSetOfInts {
    private int[] a;

    public StaticSetOfInts(int[] keys) {
        a = new int[keys.length];
        for (int i = 0; i < keys.length; i++) {
            a[i] = keys[i];
        }
        Arrays.sort(a);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    /**
     * 二分查找
     */
    private int rank(int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = In.readInts(args[0]);
        StaticSetOfInts set = new StaticSetOfInts(whiteList);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            //读取的键，如果不存在白名单中则将其打印
            int key = StdIn.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}
