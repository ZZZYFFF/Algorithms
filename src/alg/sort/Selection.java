package alg.sort;

import common.Utils;

/**
 * 选择排序
 */
public class Selection implements Sort{
    public void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0;i < N; i++){
            int min = i;
            for (int j = i+1;j < N;j++) {
                if (Utils.less(a[j], a[min])) {

                    min = j;
                }
            }
                Utils.exch(a, i, min);
        }

    }


}
