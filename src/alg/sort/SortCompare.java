package alg.sort;


import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 *
 */
public class SortCompare {
    private Insertion insertion = new Insertion();
    private Selection selection = new Selection();
    private Shell shell = new Shell();
    private Merge merge = new Merge();
    private Quick quick = new Quick();
    private Heap heap = new Heap();


    public double time(String alg,Double[] a){
        Stopwatch timer = new Stopwatch();


        if (alg.equals("Insertion"))  insertion.sort(a);
        if (alg.equals("Selection"))  selection.sort(a);
        if (alg.equals("Shell"))      shell.sort(a);
        if (alg.equals("Merge"))      merge.sort(a);
        if (alg.equals("Quick"))      quick.sort(a);
        if (alg.equals("Heap"))       heap.sort(a);

        return timer.elapsedTime();
    }

    public double timeRandonInput(String alg,int N,int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0 ;t<T;t++){
            for (int i = 0;i<N;i++){
                a[i] = StdRandom.uniform();
            }
            total += time(alg,a);
        }

        System.out.println("算法   "+alg+"： "+total);
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        SortCompare sortCompare = new SortCompare();

        double t1 = sortCompare.timeRandonInput(alg1,N,T);//算法1的总时间
        double t2 = sortCompare.timeRandonInput(alg2,N,T);//算法2的总时间

        StdOut.printf("For %d random Doubles\n   %s is", N,alg1);
        StdOut.printf(" %.1f times faster than %s\n",t2/t1,alg2);

        int n = 100;
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n*n);
        StdDraw.setPenRadius(.01);
        for (int i=1;i<=n;i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }

    }

}
