package study.algorithms.chapter2.elementarysorts;

import java.util.Arrays;

public enum SortEnum {
    /**
     * 插入排序
     */
    INSERTION("insertion"),
    /**
     * 选择排序
     */
    SELECTION("selection"),
    /**
     * 希尔排序
     */
    SHELL("shell"),
    /**
     * 归并排序
     */
    MERGE("merge"),
    /**
     * 快速排序
     */
    QUICK("quick"),
    /**
     * 堆排序
     */
    HEAP("heap");

    private String name;

    SortEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static SortEnum getSortByName(String name) {
        return Arrays
                .stream(SortEnum.values())
                .filter(sortEnum -> sortEnum.getName().equals(name))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
