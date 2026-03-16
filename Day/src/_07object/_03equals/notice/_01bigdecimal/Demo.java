package _07object._03equals.notice._01bigdecimal;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1.23");
        BigDecimal b2 = new BigDecimal("0.8");

        //减法运算
        BigDecimal res =  b1.subtract(b2);
        System.out.println(res);

        // 加法运算
        BigDecimal resAdd = b1.subtract(b2);

    }
}
