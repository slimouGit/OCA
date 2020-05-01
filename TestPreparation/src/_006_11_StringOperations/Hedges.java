package _006_11_StringOperations;

public class Hedges {
    public static void main(String[] args){
        String s = "JAVA";      //new String-Object => JAVA
        System.out.println(s);  //JAVA
        s = s + "rocks";        //new String-Object => JAVArocks
        System.out.println(s);  //JAVArocks
        s = s.substring(4,8);   //new String-Object => rock
        s.toUpperCase();        //String-Object is imuttable
        System.out.println(s);  //rock
    }

    /**
     * JAVA
     * JAVArocks
     * rock
     */
}
