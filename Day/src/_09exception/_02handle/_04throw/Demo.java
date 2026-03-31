package _09exception._02handle._04throw;

public class Demo {
    public static void main(String[] args) {
        // 针对运行时异常
        try {
            func();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void func() throws CloneNotSupportedException {
        // throw + 编译时异常对象
        // throw 异常对象 (new 出来的)
        // 需要结合throws关键字一起使用
        // 不在这里处理 交给方法的调用者处理
        throw new CloneNotSupportedException("出现了克隆异常");
    }

}
