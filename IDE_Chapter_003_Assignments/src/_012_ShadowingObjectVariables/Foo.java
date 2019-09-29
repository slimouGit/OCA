package _012_ShadowingObjectVariables;

public class Foo {
    Bar myBar = new Bar();
    public static void main(String[] args){
        Foo f = new Foo();
        System.out.println("f.myBar.barNum is " + f.myBar.barNum);
        f.changeIt(f.myBar);
        System.out.println("f.myBar.barNum after changed " + f.myBar.barNum);
    }

    private void changeIt(Bar myBar) {
        myBar.barNum = 666; //obejct reference will changed
        System.out.println("myBarbarNum in changeIt is " + myBar.barNum);
        myBar = new Bar(); //new object with new pointer
        myBar.barNum = 10000;
        System.out.println("myBarbarNum in changeIt is now " + myBar.barNum);
    }

    /**
     * OUTPUT
     * f.myBar.barNum is 42
     * myBarbarNum in changeIt is 666
     * myBarbarNum in changeIt is now 10000
     * f.myBar.barNum after changed 666
     */
}
