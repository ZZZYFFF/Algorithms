package study.algorithms.chapter1;

import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdDraw;

/**
 * @author zyf
 */
public class VisualAccumulator extends Accumulator {
    private double total;
    private int N;
    public VisualAccumulator(int trials,double max) {
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.005);
    }

    @Override
    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);

    }
}
