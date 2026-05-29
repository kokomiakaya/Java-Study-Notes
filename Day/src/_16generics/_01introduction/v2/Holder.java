package _16generics._01introduction.v2;

public class Holder <T> {
    private T car;

    public Holder(T car) {
        this.car = car;
    }

    public T getCar(){
        return car;
    }
}
