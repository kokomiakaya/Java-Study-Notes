package IOhomework.ex;

//  有这样的一个words数组，数组中每个字符串的格式为“词性:单词”
//  String[] words = {"verb:eat","verb:drink","verb:sleep","verb:play","noun:rice","noun:meat","noun:hand","noun:hair"};
//根据单词性质动词verb全部存入verb.txt文件中
//
//根据单词性质名词noun全部存入noun.txt文件中


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        String[] words = {"verb:eat","verb:drink","verb:sleep","verb:play","noun:rice","noun:meat","noun:hand","noun:hair"};
        String[] wordVerb = new String[words.length];
        String[] wordNoun = new String[words.length];

        int i = 0;
        int j = 0;

        for(String word : words){
           if (word.startsWith("verb")){
               wordVerb[i ++] = word;
           } else if (word.startsWith("noun")){
               wordNoun[j ++] = word;
           }

        }

        FileOutputStream fos = null;
        FileOutputStream fos2 = null;
        try {
             fos = new FileOutputStream("E:\\CodeJava\\Test\\verb.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            fos2 = new FileOutputStream("E:\\CodeJava\\Test\\noun.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (String str : wordVerb){
            try {
                if (str != null) {
                    fos.write(str.getBytes());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (String str : wordNoun){
            try {
                if (str != null) {
                    fos2.write(str.getBytes());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fos2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
