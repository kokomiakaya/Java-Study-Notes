package IOhomework.byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String strEnd = "end";
        // 方法小驼峰
        writeToFile(strEnd);
    }

    private static void writeToFile(String strEnd) {
        FileOutputStream fos = null;
        try {
            System.out.println("请输入文件名");
            Scanner sc = new Scanner(System.in);
            String fileName = sc.nextLine();
            fos = new FileOutputStream(fileName,true);
            while(true){
                System.out.println("请输入内容：");
                String line = sc.nextLine();
                if (line.equals(strEnd)){
                    break;
                }
                fos.write(line.getBytes());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
