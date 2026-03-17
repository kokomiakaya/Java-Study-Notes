package _08stringhomework._01ex;

/*
 统计这段绕口令有多少个以p开头的单词
"peter piper picked a peck of pickled peppers"
tips:
- split
- startsWith
 */

// String中split的重载
// 版本1：按分隔符分割，返回字符串数组（默认分割所有匹配项）
//String[] split(String regex)
//
// 版本2：按分隔符分割，限制返回数组的长度（limit）
//String[] split(String regex, int limit)

public class Demo {
    public static void main(String[] args) {
        // 1. 先用split将字符串化成字符数组
        String str = "peter piper picked a peck of pickled peppers";
        String[] strArr = str.split(" ");
        // 2. 用startWith判断单词是否以p开头
        int cnt = 0;
        for (String elem : strArr) {
            if(elem.startsWith("p")) {
                cnt++;
            }
        }
        // 3. 统计个数
        System.out.println("cnt = " + cnt);
    }
}
