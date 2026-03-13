package _06oop3._02exercise;

public class Demo {
    public static void main(String[] args) {
        BaseStaff bC = new Coder("zhangsan",1,10000);
        bC.work();
        bC.printStaff();

        BaseStaff bN = new NormalStaff("lisi",2,20000);
        bN.work();
        bN.printStaff();

        BaseStaff bM = new Manager("wangwu",3,30000);
        bM.work();
        bM.printStaff();

    }
}

abstract class BaseStaff{
    String name;
    int id;
    double salary;

    public abstract void work();
    public abstract void printStaff();

    public BaseStaff(String name, int id, double salary) {
        this.name = name;
        this.id = id;
    }
}

class Coder extends BaseStaff{

    public void work() {
        System.out.println("Coder works...");
    }

    public void printStaff() {
        System.out.println("Staff Coder loading...");
    }

    public Coder(String name, int id, double salary) {
        super(name, id, salary);
    }
}

class NormalStaff extends BaseStaff{
    public void work() {
        System.out.println("NormalStaff works...");
    }

    public void printStaff() {
        System.out.println("Staff NormalStaff loading...");
    }

    public NormalStaff(String name, int id, double salary) {
        super(name, id, salary);
    }
}

class Manager extends BaseStaff{

    double bonus;

    public void work() {
        System.out.println("Manager works...");
    }

    public void printStaff() {
        System.out.println("Staff Manager loading...");
    }

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

}
