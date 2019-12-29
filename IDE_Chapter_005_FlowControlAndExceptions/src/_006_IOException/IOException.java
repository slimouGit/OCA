package _006_IOException;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IOException {
    public static void main(String[] ars){
        try {
            new IOException().readFile();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (java.io.IOException e) {
            System.err.println("IO Error");
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }

    private void readFile() throws java.io.IOException {
        RandomAccessFile raf = new RandomAccessFile("file.txt", "r");
        byte b[] =  new byte[1000];
        raf.readFully(b,9,1000);
    }
}
