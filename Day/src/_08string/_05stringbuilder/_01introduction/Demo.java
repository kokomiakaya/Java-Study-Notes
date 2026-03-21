package _08string._05stringbuilder._01introduction;



public class Demo {
    public static void main(String[] args) {

        String str = "";
        System.out.println("");
        // 时间戳
        // 字符串拼接占用了大量的时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("经过了 " + (end - start)/1000 + " s");

    }
}
