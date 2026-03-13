package _01array;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        // 数组是存储多个，具有相同数据类型的数据元素的有序容器（集合）
        // 数组的声明
        // 数据类型[] 数组名;
        // 数组的静态初始化  由程序员显式的，指定数组中每个元素的初始值，数组的长度由系统决定（实际上也是由程序员给出的）
        // 数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
        // 静态初始化有简写的形式，可以省略new关键字，如下：
        // 数据类型[] 数组名 = {元素1，元素2，元素3...}

        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        // 数组的动态初始化
        // 动态初始化指的是：
        // 程序员只是指定数组的长度，数组中每个元素的初始值由系统（实际上是JVM）决定。
        // 和数组的声明写在一起，语法格式就是：
        // 数据类型[] 数组名 = new 数据类型[数组大小];
        int[] arr3 = new int[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);

        // 数组的长度是一个int类型整数，Java不支持long类型作为数组长度
        // int len = 数组名.length;
        System.out.println("array length: " + arr.length);

    }
}
