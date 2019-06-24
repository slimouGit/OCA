package _024_Test._03;

import static java.lang.System.out;

class _ {
    static public void main(String[] __A_V_) {
        out.println("arg length " + __A_V_.length);
        String $ = "";
        for (int x = 0; x <= __A_V_.length;) {
            $ += __A_V_[x];
            out.println("arg length " + __A_V_.length);
            out.println($);
        }
        /**
         command line java _ - A .
         Output is A.
         */
    }
}