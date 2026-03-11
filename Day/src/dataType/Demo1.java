package dataType;

import java.sql.SQLOutput;

public class Demo1 {
    public static void main(String[] args) {
        int longBits = Long.SIZE;
        int longBytes = longBits / 8;
        System.out.println("Long数据类型占 " + longBytes + " 字节，占 " + longBits + " 位");
        //基本数据类型包括整型、浮点数类型、布尔类型和字符型变量
        // 整数类型变量：byte(1个字节) short(2个字节) int(4个字节) long(8个字节)
        byte numByte = 127;
        System.out.println("numByte = " + numByte);

        short numShort = 32767;
        System.out.println("numShort = " + numShort);

        int numInt = 66;
        System.out.println("numInt = " + numInt);

        //long类型定义要在后面写L，用于和int类型变量区分
        long numLong = 66L;
        System.out.println("numLong = " + numLong);

        // 浮点数类型：float double boolean
        // 单精度浮点数
        float valFloat = 3.14F;
        System.out.println("valFloat = " + valFloat);

        // 双精度浮点数
        double valDouble = 3.14;
        System.out.println("valDouble = " + valDouble);

        // 字符型 char占两个字节，表示16位的无符号整数，java中char类型能够表示在[0,65536]之内的所有字符
        // 使用的编码集是Unicode编码集
        char c = 'a';
        System.out.println("c = " + c);
        // 这里a的ascall码是97
        System.out.println(c + 10);

        //布尔类型
        // 布尔类型变量具体占用内存的大小，要分情况而定（以下作简单了解）根据JVM规范中提供的数据：
        // 1. 一个独立的boolean类型变量当作int处理，占4个字节。
        //2. 在boolean数组当成byte数组处理，一个boolean元素占1个字节，节省空间。



    }
}

