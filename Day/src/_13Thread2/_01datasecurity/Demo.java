package _13Thread2._01datasecurity;

public class Demo {
    public static void main(String[] args) {
        SellWindow t1 = new SellWindow();
        SellWindow t2 = new SellWindow();
        SellWindow t3 = new SellWindow();

        t1.setName("A窗口");
        t2.setName("B窗口");
        t3.setName("C窗口");

        t1.start();
        t2.start();
        t3.start();

    }
}

class SellWindow extends Thread {
    int tickets = 100;
    public void run() {
        while(true){
            if (tickets > 0) {
                System.out.println(getName() + "卖了第"
                        + (tickets --) + " 张票");
            }
        }
    }
}