package _18collection._01introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println(arrayList);

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("c");
        arrayList.add(null);

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }


    }
}
