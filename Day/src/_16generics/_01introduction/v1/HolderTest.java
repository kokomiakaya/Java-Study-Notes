package _16generics._01introduction.v1;

public class HolderTest {
    public static void main(String[] args) {
        Holder car = new Holder(new AutoCar());
        Object obj = car.getCar();
        ((AutoCar)obj).run();

        Holder car2 = new Holder(new Bike());
        Object obj2 = car2.getCar();
        ((Bike)obj2).run();
    }
}
