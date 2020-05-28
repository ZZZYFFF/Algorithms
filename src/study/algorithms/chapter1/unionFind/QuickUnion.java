package study.algorithms.chapter1.unionFind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * quick-union算法 (N+3)(N-1)~N^2 平方级别
 * 进入编译后的文件夹，执行：
 * java -classpath . study.algorithms.chapter1.unionFind.QuickFind < tinyUF.txt
 *
 * @author zyf
 */
public class QuickUnion {
    /**
     * 分量id
     */
    private int[] id;
    /**
     * 分量数量
     */
    private int count;

    /**
     * 初始化分量id数组
     *
     * @param n 触点数量
     */
    public QuickUnion(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * p所在分量的标识符
     *
     * @param p 触点
     * @return
     */
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    ;

    /**
     * 在pq之间添加一条连接
     *
     * @param p 触点1
     * @param q 触点2
     */
    public void union(int p, int q) {
        //将pq的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        id[pRoot] = qRoot;
        count--;
    }

    /**
     * largeUF.txt --> 共耗时: 666636
     *
     * @param args < file
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = StdIn.readInt();
        QuickFind unionFind = new QuickFind(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (unionFind.connected(p, q)) {
                continue;
            }
            unionFind.union(p, q);
            StdOut.println(p + "-->" + q);
        }
        long end = System.currentTimeMillis();
        StdOut.println(unionFind.count() + " components");
        System.out.println("---------共耗时: " + (end - start));
    }
}
