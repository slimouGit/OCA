package _008_StringObjects;

public class StringObjectRefernce {
    public static void main(String[] args){
        String x = "Fred";
        System.out.println("x " + x);

        String y = x;
        System.out.println("y " + y);

        y = y.toUpperCase(); //new String Object is created
        System.out.println("y " + y);

        y = x;
        System.out.println("y " + y);
    }

    /**
     * OUTPUT
     * x Fred
     * y Fred
     * y FRED
     * y Fred
     */
}
