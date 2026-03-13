package _01array;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
//      func();
//      func2();
//        func3();
        func4();
    }

    //练习1：
//  静态初始化一个数组，输出数组名及元素。然后给数组中的元素赋值，再次输出数组名及元素。
    public static void func(){

        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr);
        for(int i = 0;i < arr.length;i ++){
            System.out.print(arr[i] + " ");
        }
    }

    //练习2：
//  分别静态、动态初始化两个数组，分别输出数组名及元素。然后分别给数组中的元素赋值，再次分别输出数组名及元素。
    public static void func2(){
        // 静态初始化
        int[] arr = {1,2,3,4,5};
        // 动态初始化
        int[] arr2 = new int[5];
        //动态初始化赋值
        for(int i = 0;i < arr2.length;i ++){
            arr2[i] = arr[i] * 10;
        }

        //分别输出数组名
        System.out.println(arr);
        System.out.println(arr2);

        //输出数组元素
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        for(int i = 0;i < arr.length;i ++){
            arr[i] = arr[i] * 2;
        }

        for(int i = 0;i < arr2.length;i ++){
            arr2[i] = arr2[i] * 3;
        }

        //分别输出数组名和数组元素
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    //练习3：
//   定义两个数组：
//    静态初始化一个数组，输出数组名，元素取值，长度。
//    然后声明第二个数组，把第一个数组的地址赋值给第二个数组。
//    输出第二个数组的数组名，元素取值，长度
//    然后给第二个数组赋值，再次输出两个数组的名及元素

    public static void func3(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr); // 输出数组的地址
        System.out.println(Arrays.toString(arr)); // 输出数组元素
        System.out.println(arr.length); // 输出数组长度 10

        int[] arr2 = arr;
        System.out.println(arr2); // 输出的地址是arr的地址
        System.out.println(Arrays.toString(arr2)); // 输出结果与arr一致
        System.out.println(arr2.length); // 输出长度 10

        arr2 = new int[]{10,9,8,7,6,5,4,3,2,1,0}; // 这里arr2只是进行了初始化，得到了arr的地址
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        System.out.println(arr2); // 新的地址，与arr不同
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2.length);

    }

    public static void func4(){
        int[] arr; // 只是声明了数组，没有进行初始化，编译出错
//        System.out.println(arr);

        // 长度为0的数组
        int[] arr2 = new int[0];
        System.out.println(arr2);

        int[] arr3 = null;
        System.out.println(arr3);

    }

}
