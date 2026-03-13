package _04oop1;

public class Demo6 {
    public static void main(String[] args) {
        athlete athlete = new athlete("Kobe");
        athlete athlete2 = new athlete("Curry");
        athlete athlete3 = new athlete("Durant");

        athlete.shout();
        athlete2.shout();
        athlete3.shout();

        System.out.println(athlete.count);
    }
}
// 静态成员
// [访问权限修饰符] static 数据类型 变量名;

// 静态方法

class athlete{
    String name;
    public static int count;

    public athlete(){

    }

    public athlete(String name){
        this.name = name;
    }

    public void shout(){
        count += 3;
        System.out.println(count);
    }

}