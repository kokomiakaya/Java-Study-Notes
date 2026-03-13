package _05oop2.basic._03sequence;

public class Demo2 {
    public static void main(String[] args) {

    }
}


// 显式子类对象初始化
// 1. super在构造器中用于表示调用父类构造器时，例如super(参数)，该条语句必须在第一行。
// 2. this在构造器中用于表示调用自身构造器时，例如this(参数)，该条语句必须在第一行。
// 3. 显然super、this两个关键字在表示调用构造器时，是绝不可能共存的。

// 对于super的理解：
// 上面其实已经说过了，你完全可以直接把super关键字，看成指向当前类的父类"对象"的一个引用。即：
// 1. this代表当前类的当前对象。
// 2. super表示当前类的父类对象。