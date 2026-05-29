package _16generics._01introduction.v2;


public class HolderTest {
    public static void main(String[] args) {
        Holder<AutoCar> car = new Holder<>(new AutoCar());
        car.getCar().run();

        Holder<Bike> bike = new Holder<>(new Bike());
        bike.getCar().run();

        Holder<Truck> truck = new Holder<>(new Truck());
        truck.getCar().run();

    }
}
