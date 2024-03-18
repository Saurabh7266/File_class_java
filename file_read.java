package oops_java.file_class_38;

import java.io.FileReader;

/**
 * file_read
 */
public class file_read {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("/home/saurabh-g-pandey/Desktop/my kali/Bhadra Kali/bro@code/My_learn/oops_java/file_class_38/ram.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                 data = reader.read();
            }
            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}