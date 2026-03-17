package _08stringhomework._02ex;

/*
把字符串"lengendary"中字符 改成间隔大写小写模式，即 "LeNgEnDaRy"
 */

public class Demo {
    public static void main(String[] args) {
        String str = "lengendary";
        // 分奇偶数
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                if(i % 2 == 0) {
                    ch = Character.toUpperCase(ch);
                }
            str2 += ch;
        }
        System.out.println(str2);
    }
}
