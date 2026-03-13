package _06oop3._05anonymous._02basic;

/*

这里我们直接说明一下，匿名内部类对象的两种使用方式：

- 可以直接在后面调用方法，访问它的成员（当一个匿名对象使用）
  1. 优点是：可以访问子类独有的成员。方便快捷，不需要用引用接收再去使用
  2. 缺点是：一次性，仅能用一次
- 可以用（父）引用接收对象，然后再用引用访问成员
  1. 优点是：可以用多次
  2. 缺点是：不能访问子类独有成员（被父类引用限制了访问范围，无法强转，因为子类已经匿名了)

综上，两种使用方式场景不同。如果有多次使用需求，就需要父引用接收；反之如果仅用一次，或者需要访问子类独有成员，就必须直接使用，不能用引用接收。
 */

public class Demo {
    public static void main(String[] args) {
        // 重写父类的方法
        new Father(){
            @Override
          void m1(){
              System.out.println("Father的匿名子类对象");
          }
        }.m1();

        // 父类的引用接受匿名子类对象
        Father f = new Father(){
          void m1(){
              System.out.println("Father的匿名子类对象");
          }
        };
        f.m1();

        IA ia = new IA() {
            public void m2(){
                System.out.println("IA的匿名子类对象");
            }
        };

        ia.m2();
    }
}

class Father {
    void m1(){
        System.out.println("Father m1()");
    }
}

interface IA{
    void m2();
}
