package _024_Test._05.pkgB;

import _024_Test._05.pkgA.*;

public class Baz {
    public static void main(String[] args){
        //other package
        Foo f = new Foo();
        //System.out.println(" " + f.a);
        //System.out.println(" " + f.b);
        System.out.println(" " + f.c);

        //same package
        ClooFoo c = new ClooFoo();
        System.out.println(" " + c.a);
        System.out.println(" " + c.b);
        System.out.println(" " + c.c);
    }
}
