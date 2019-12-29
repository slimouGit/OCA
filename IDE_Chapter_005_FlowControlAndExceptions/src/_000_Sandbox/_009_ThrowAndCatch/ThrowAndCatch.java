package _000_Sandbox._009_ThrowAndCatch;

import java.io.IOException;

public class ThrowAndCatch {
    public static void main(String[] args){
        try {
            new ThrowAndCatch().doStuff();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void doStuff() throws IOException {
        throw new IOException();
    }
}
