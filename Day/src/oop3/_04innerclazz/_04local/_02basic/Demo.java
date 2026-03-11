package oop3._04innerclazz._04local._02basic;

/*
局部内部类与外部类的关系?
    把局部内部类当做外部类的一个局部变量理解

局部内部类访问特点
    内部类----->外部类
        成员方法:
            可以直接通过成员名去访问
            通过this.访问内部类成员
            通过类名.this.访问的外部类成员
        静态方法:
            需要先创建外部类对象,通过对象.访问
        不受权限控制
    外部类----->内部类
        成员方法: 作用域内创建内部类对象,通过对象.去访问
        静态方法: 作用域内创建内部类对象,通过对象.去访问
        不受权限的影响
    内部类----->外部其他类
        创建外部其他类对象,通过对象.访问
        受访问权限控制
 */


public class Demo {
    int a = 1;
    private int b = 2;
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Outer {

    int a = 1;
    static int b = 2;

    public void outMethod() {
        //局部位置
      class Inner {
          int a = 11;
          private int aa = 10;


          public void innerMethod() {
              // 内部类访问外部类
              System.out.println(a);
              System.out.println(this.a);
              System.out.println(Outer.this.a);

              // 访问外部类的成员方法
              outNormalMethod();
              // 访问外部类的静态方法
              outStaticMethod();

              // 访问外部类的静态成员
              System.out.println(Outer.b);

              // 局部内部类访问外部其他类
              // 通过创建对象访问，但受访问权限修饰符控制
              Demo demo = new Demo();
              System.out.println(demo.a);

          }

      }

        // 外部类访问局部内部类
        // 在内部类的作用域内访问，创建局部内部类的对象
        Inner inner = new Inner();
        System.out.println(inner.a);
        // 私有成员也可以访问到
        System.out.println(inner.aa);
        inner.innerMethod();

    }

    public void outNormalMethod() {
        System.out.println("void outNormalMethod()");
    }

    public void outStaticMethod() {
        System.out.println("void outStaticMethod()");
    }

}