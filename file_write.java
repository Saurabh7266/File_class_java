package oops_java.file_class_38;

import java.io.FileWriter;

/**
 * file_write
 */
public class file_write {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/home/saurabh-g-pandey/Desktop/my kali/Bhadra Kali/bro@code/My_learn/oops_java/file_class_38/ram.txt");
            writer.write("hey i am the boos");
            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}