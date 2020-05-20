package study.algorithms.chapter1;

import java.util.Scanner;

/**
 * @author zyf
 * 测试重定向符号 <
 * 结果：idea中此符号无用，linux中可以使用
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        while (next.hasNextLine()){
            System.out.println(next.next());
        };
    }
}
