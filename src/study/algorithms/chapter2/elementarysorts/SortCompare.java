package study.algorithms.chapter2.elementarysorts;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

/**
 * 比较排序算法
 *
 * @author zyf
 */
public class SortCompare {
    public static double time(String sortName, Double[] a) {
        Stopwatch timer = new Stopwatch();
        Sort sort = null;
        SortEnum sortEnum = SortEnum.getSortByName(sortName);
        switch (sortEnum) {
            case INSERTION:
                sort = new Insertion();
                break;
            case SELECTION:
                sort = new Selection();
                break;
            case SHELL:
                sort = new Shell();
                break;
            case MERGE:
                sort = new Merge();
                break;
            case QUICK:
                sort = new Quick();
                break;
            case HEAP:
                sort = new Heap();
                break;
            default:
                break;
        }

        sort.sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String sortName, int n, int t) {
        //使用算法alg将t个场地为n的数组排序
        double total = 0d;
        Double[] a = new Double[n];
        for (int i = 0;i<t;i++){
            for (int j = 0;j<n;j++){
                a[j] = StdRandom.uniform();
            }
            total +=time(sortName,a);
        }
        return total;
    }

    public static void main(String[] args) {
        String firstSort = args[0];
        String secondSort = args[1];
        int n = Integer.parseInt(args[2]);
        int t = Integer.parseInt(args[3]);
        double firstTime = timeRandomInput(firstSort,n,t);
        double secondTime = timeRandomInput(secondSort,n,t);
        StdOut.printf("For %d random Double\n    %s is",n,firstSort);
        StdOut.printf(" %.1f times faster than %s\n",secondTime/firstTime,secondSort);
    }
}
