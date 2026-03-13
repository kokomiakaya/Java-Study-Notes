package _06oop3._04innerclazz._02member._02ex;

public class Demo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer{
    public int num = 10;
    class Inner{
        public int num = 20;
        public void show(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }

}