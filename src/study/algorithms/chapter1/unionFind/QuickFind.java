package study.algorithms.chapter1.unionFind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * quick-find算法 (N+3)(N-1)~N^2 平方级别
 * 进入编译后的文件夹，执行：
 * java -classpath . study.algorithms.chapter1.unionFind.QuickFind < tinyUF.txt
 * @author zyf
 */
public class QuickFind {
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
    public QuickFind(int n) {
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
        return id[p];
    }

    ;

    /**
     * 在pq之间添加一条连接
     *
     * @param p 触点1
     * @param q 触点2
     */
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        //pq已经在相同分量中不采取任何行动
        if (pId == qId) {
            return;
        }
        //将p的分量重命名为q的名称
        for (int i = 0;i<id.length;i++){
            if (id[i] == pId){
                id[i] = qId;
            }
        }
        count--;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickFind unionFind = new QuickFind(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (unionFind.connected(p, q)) {
                continue;
            }
            unionFind.union(p, q);
            StdOut.println(p + "" + q);
        }
        StdOut.println(unionFind.count + "components");
    }

}
