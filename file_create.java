package oops_java.file_class_38;

import java.io.File;

import java.util.Scanner;

public class file_create {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            

            File file = new File("/home/saurabh-g-pandey/Desktop/my kali/Bhadra Kali/bro@code/My_learn/oops_java/file_class_38/ram.java");
            if (file.exists()) {
                // file.deleteOnExit();
                
                System.out.println("file pahle se hai do you want del the file ");
                String input = sc.nextLine();
                if (input.equals("del") ){
                    file.delete();
                    System.out.println("the file was del :(");
                }
                else{
                    System.out.println("file is not del :{)");
                }
            }
            
            else{
                file.createNewFile();
               System.out.println("Rom Rom BHAIYO");
               System.out.println("System phad denge");
            }
        } catch (Exception e) {
            System.out.println("some exception in your code "+ e);
        }
       
    }    
}
