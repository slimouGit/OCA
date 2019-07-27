package _000_Sandbox._010_StaticAccessTests;

public class Bar {
    //NONSTATIC METHOD
    void go(){
        System.out.println("i go ja schon");
    }

    //STATIC METHOD
    static void goWeiterWeg(){
        //go();   //static method cannot access a nonstatic method

        //possible access by creating an object
        Bar b = new Bar();
        b.go();
    }

    //STATIC METHOD
    public static void main(String[] args){
        //access to static method from static method possible
        goWeiterWeg();

        //possible access by creating an object
        Bar b2 = new Bar();
        b2.go();
    }
}
