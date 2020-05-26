package study.algorithms.chapter1.unionFind;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author zyf
 */
abstract class UnionFind {
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
     * @param n 触点数量
     */
    public UnionFind(int n){
        count = n;
        id = new int[n];
        for (int i = 0;i<n;i++){
            id[i] = i;
        }
    }

    public int count(){ return count;}
    public boolean connected(int p,int q){return find(p) == find(q);}

    /**
     *  p所在分量的标识符
     * @param p 触点
     * @return
     */
    public abstract int find(int p);

    /**
     * 在pq之间添加一条连接
     * @param p 触点1
     * @param q 触点2
     */
    public abstract void union(int p,int q);

    public static void main(String[] args) {
        int n = StdIn.readInt();
//        UnionFind unionFind = new UnionFind(n);
    }

}
