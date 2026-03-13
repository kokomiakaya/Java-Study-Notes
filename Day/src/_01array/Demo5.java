package _01array;

import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        // Java中的值传递问题
//        实际上来说，Java只存在值传递，方法得到的是变量的拷贝，而不是变量的地址。
        int a = 1;
        System.out.println("before doubleIntValue a = " + a);
        doubleIntValue(a);
        System.out.println("after doubleIntValue a = " + a);

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{5,6,7,8,9};
        swapArray(arr1, arr2); // 无法改变arr1和arr2的指向
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void doubleIntValue(int a) {
        a *= 2;
    }

    public static void swapArray(int[] arr1,int[] arr2){
        int[] temp;
        temp = arr1;
        arr1 = arr2;
        arr2 = temp;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
