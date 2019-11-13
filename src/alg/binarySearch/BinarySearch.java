package alg.binarySearch;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo<=hi){
            int mid = lo + (hi-lo) / 2;
            if (key<a[mid]) hi = mid - 1;
            else if(key>a[mid]) hi = mid + 1;
            else  return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        //TODO 测试总是通不过。。。
        System.out.println("args[0]: "+args[0]);
        System.out.println("args[1]: "+args[1]);
        System.out.println("args[2]: "+args[2]);
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
//        System.out.println(StdIn.isEmpty());
        int sss = StdIn.readInt();
        System.out.println("sss: "+sss);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            System.out.println("key: "+key);
            if (rank(key,whitelist)<0){
                StdOut.println(key);
            }
        }
        System.out.println("out");
    }
}
