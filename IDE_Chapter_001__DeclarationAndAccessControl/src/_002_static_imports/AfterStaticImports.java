package _002_static_imports;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.toHexString;
//import static java.lang.Long.*; Fehler, weil MAX_VALUE in Integer und Long

public class AfterStaticImports{
    public static void main(String[] args){
        System.out.println(MAX_VALUE);
        System.out.println(toHexString(42));
    }
}