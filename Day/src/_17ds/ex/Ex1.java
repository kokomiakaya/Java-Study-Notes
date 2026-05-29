package _17ds.ex;

import org.junit.Test;

public class Ex1 {
    @Test
    public void test() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        print(a);

        Node newHead = reverse(a);
        print(newHead);



    }

    public void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public Node reverse(Node node) {
        // 递归出口
        if (node == null || node.next == null) {
            return node;
        }

        Node newHead = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

}
