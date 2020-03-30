package _001_003_AccessCompositions.pkgB;

import _001_003_AccessCompositions.pkgA.Foo;

public class Baz {
    public static void main(String[] args){
        Foo f = new Foo();
        //System.out.println(f.a);  default mebmer can not access from outside package
        //System.out.println(f.b);  Variable has protected access in other package
        System.out.println(f.c);
    }
}
