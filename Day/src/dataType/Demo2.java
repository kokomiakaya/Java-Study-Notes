package dataType;

public class Demo2 {
    public static void main(String[] args) {
        double a = 0.1;
        // 默认浮点数类型为double类型
        // 生命float类型要加f或F
        float b = 0.1F;
        //由于浮点数精度，两者的值并不相等
        System.out.println(a == b);

        float a2 = 0.1F;
        float b2 = 0.10000000000000000001F; //中间18个0
        System.out.println(a2 == b2);
    }
}
