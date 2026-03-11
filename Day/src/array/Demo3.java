package array;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
//        数组的遍历
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int i = 0; i < arr.length; i++) {
        if (i == 0)  System.out.print("[");
        if (i == arr.length - 1) {
            System.out.print(arr[i] + "]");
        }else{
            System.out.print(arr[i] + ", ");
        }

    }
        System.out.println();
        System.out.println(Arrays.toString(arr));
//        该方法需要传入一个一维数组，返回值是一个遍历结果的字符串

        // 增强的for循环
        // for(数据类型 变量名：要遍历的数组或几何){
        //  System.out.println(变量名)
        // }
        // 注意：在增强for当中是不能修改任何元素的取值的

        for(int elem : arr){
            System.out.println(elem);
        }

    }
}
