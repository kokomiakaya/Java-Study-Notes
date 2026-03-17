package _08stringhomework._03ex;

/*
大串中小串出现的次数
在字串”woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”
中java出现了5次, 统计次数
 */

public class Demo {
    public static void main(String[] args) {
        // 目标字符串
        String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        // 查询的字符串
        String target = "java";
        // 设置查找位置
        int fromIndex = 0;
        int cnt = 0;
        int len = target.length();
        // 使用indexOf
        // 查找当前字符串中，目标字符串首次出现的位置(如果没找到返回-1)
        while((fromIndex = str.indexOf("java",fromIndex)) != -1) {
                cnt ++;
                fromIndex ++;
        }
        System.out.println("查询字符串 " + target + " 出现的次数 = " + cnt);
    }
}
