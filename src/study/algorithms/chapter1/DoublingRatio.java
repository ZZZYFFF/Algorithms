package study.algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * 倍率实验
 *
 * @author zyf
 */
public class DoublingRatio {
    public static double timeTrial(int n) {
        //为处理n个随机的六位整数的ThreeSum.count()计时
        int max = 1000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(-max, max);
        }
        Stopwatch timer = new Stopwatch();
//        ThreeSum.count(a);
        ThreeSumFast.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        double prev = timeTrial(125);
        int n = 250;
        while (true) {
            double time = timeTrial(n);
            StdOut.printf("%6d %7f ",n,time);
            StdOut.printf("%5.1f\n",time/prev);
            n += n;
            prev = time;
        }
    }
}
