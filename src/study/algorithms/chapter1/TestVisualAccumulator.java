package study.algorithms.chapter1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author zyf
 */
public class TestVisualAccumulator {
    /**
     * @param args 2000
     */
    public static void main(String[] args) {
        int in = Integer.parseInt(args[0]);
        VisualAccumulator accumulator = new VisualAccumulator(in, 1.0);
        for (int t = 0; t < in; t++) {
            accumulator.addDataValue(StdRandom.uniform());
        }
        StdOut.println(accumulator);
    }
}
