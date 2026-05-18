package _011IO._04nio;

import java.nio.ByteBuffer;

public class NIOTest {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println(buffer);

        buffer.put((byte)97);
        System.out.println(buffer);
    }
}
