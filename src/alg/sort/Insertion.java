package alg.sort;

import common.Utils;

/**
 * 插入排序
 */
public class Insertion implements Sort{
    public  void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0;i<N;i++){
            for (int j = i;j > 0 && Utils.less(a[j],a[j-1]);j--){
                Utils.exch(a,j,j-1);
            }
        }
    }

}
