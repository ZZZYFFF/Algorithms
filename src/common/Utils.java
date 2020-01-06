package common;


/**
 * 排序算法类模板
 */
public class Utils {

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    public static void exch (Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void  show(Comparable[] a){
        for (int i = 0;i<a.length;i++){
            if (i < a.length-1){
                System.out.print(a[i]+", ");
            }
            if(i==a.length-1){
                System.out.print(a[i]);
            }
        }
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 1;i<a.length;i++){
            if (less(a[i],a[i-1])) {
                return false;}
        }
        return true;
    }


    public static int i = 1;
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println(i+1);
            i+=1;
            Thread t =new Thread(
            );
            t.start();
//            t.sleep();
        }
    }





}
