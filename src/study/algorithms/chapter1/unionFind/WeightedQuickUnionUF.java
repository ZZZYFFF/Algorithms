package study.algorithms.chapter1.unionFind;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * quick-union算法
 * 进入编译后的文件夹，执行：
 * java -classpath . study.algorithms.chapter1.unionFind.WeightedQuickUnionUF < tinyUF.txt
 *
 * @author zyf
 */
public class WeightedQuickUnionUF {
    /**
     * 分量id
     */
    private int[] id;
    /**
     * 各个分节点对应分量的大小
     */
    private int[] sz;
    /**
     * 分量数量
     */
    private int count;

    /**
     * 初始化分量id数组
     *
     * @param n 触点数量
     */
    public WeightedQuickUnionUF(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            sz[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * @param p 触点
     * @return p所在分量的标识符
     */
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    /**
     * 在pq之间添加一条连接
     *
     * @param p 触点1
     * @param q 触点2
     */
    public void union(int p, int q) {
        //将pq的根节点统一
        int i = find(p);
        int j = find(q);
        if (i == j) {
            return;
        }
        //将小树的根节点连接到大树的根节点
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }else {
            id[j] = i;
            sz[i] +=sz[j];
        }
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
