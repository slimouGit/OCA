package _000_Sandbox._011_StaticNonStaticAccess;

public class StaticTest {
    int nonStaticVar = 42;
    static int staticVar = 7;

    void nonStaticMethod(){
        System.out.println("I am NOT a static method");
    }

    static void staticMethod(){
        System.out.println("I am absolutly a static method");
    }

    void nonStatic_TEST_Method(){

        //STATIC FROM NON STATIC

        //Call a STATIC method from NON STATIC method
        staticMethod();
        StaticTest.staticMethod();
        new StaticTest().staticMethod();

        //Call a STATIC variable from NON STATIC method
        System.out.println("static variable called from NON static method " + staticVar);
        System.out.println("static variable called from NON static method " + StaticTest.staticVar);
        System.out.println("static variable called from NON static method " + new StaticTest().staticVar);

        //NON STATIC FROM NON STATIC

        //Call a NON STATIC method from NON STATIC method
        nonStaticMethod();
        //StaticTest.nonStaticMethod();
        new StaticTest().nonStaticMethod();

        //Call a non STATIC variable from NON STATIC method
        System.out.println("NON static variable called from NON static method " + nonStaticVar);
        //System.out.println("NON static variable called from NON static method " + StaticTest.nonStaticVar);
        System.out.println("NON static variable called from NON static method " + new StaticTest().nonStaticVar);
    }

    static void static_TEST_Method(){

        //STATIC FROM STATIC

        //Call a STATIC method from STATIC method
        staticMethod();
        StaticTest.staticMethod();
        new StaticTest().staticMethod();

        //Call a STATIC variable from STATIC method
        System.out.println("static variable called from static method " + staticVar);
        System.out.println("static variable called from static method " + StaticTest.staticVar);
        System.out.println("static variable called from static method " + new StaticTest().staticVar);

        //NON STATIC FROM STATIC

        //Call a NON STATIC method from STATIC method
        //nonStaticMethod();
        //StaticTest.nonStaticMethod();
        new StaticTest().nonStaticMethod();

        //Call a NON STATIC variable from STATIC method
        //System.out.println("NON static variable called from static method " + nonStaticVar);
        //System.out.println("NON static variable called from static method " + StaticTest.nonStaticVar);
        System.out.println("NON static variable called from static method " + new StaticTest().nonStaticVar);
    }


    public static void main(String[] args){
        System.out.println("Invoke from NON static context");
        new StaticTest().nonStatic_TEST_Method();

        System.out.println("\nInvoke from static context");
        static_TEST_Method();
    }
}
