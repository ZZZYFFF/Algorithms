package study.algorithms.chapter1;

/**
 * 计时器
 * @author zyf
 */
public class StopWatch {
    private final long start;

    public StopWatch() {
        this.start = System.currentTimeMillis();
    }

    public double elapsedTime(){
        long now = System.currentTimeMillis();
        return (now - start) / 1000d;
    }

}
