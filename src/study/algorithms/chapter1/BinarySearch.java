package study.algorithms.chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author zyf
 * 二分查找
 * 运行参数：tinyT.txt < tinyW.txt
 * tinyW.txt
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            //读取的键，如果不存在白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key,whiteList) < 0){
                StdOut.println(key);
            }
        }
    }

    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        //被查找的键要么不存在，要么必然存在a[lo..hi]之中
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]){
                lo  = mid + 1;
            }else {
                return  mid;
            }
        }

        return -1;
    }


}
