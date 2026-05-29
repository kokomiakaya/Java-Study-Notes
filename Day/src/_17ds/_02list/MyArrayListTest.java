package _17ds._02list;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void test() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.print();

        // 输出线性表大小
//        int listSize =  list.getSize();
//        System.out.println(listSize);
//        list.print();
//
//        list.remove(2);
//        list.print();
//
//        int res = list.contains("b");
//        System.out.println(res);

//        list.add(2,"h");
//        list.print();

//        String elem =  list.contains(2);
//        System.out.println(elem);

        list.set(3,"h");
        list.print();

        // 这里抛出异常了
        // 并且异常被捕获
        try{
            list.set(10,"5");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        list.print();
    }
}
