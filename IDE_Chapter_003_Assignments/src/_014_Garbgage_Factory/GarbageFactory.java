package _014_Garbgage_Factory;

import java.util.Date;

public class GarbageFactory {
    public static void main(String[] args){
        Date d = getDate();
        System.out.println("d = " + d);
    }

    private static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        //"now" is eligible for garbage collector
        return d2;
        //"d2" srvives method, because is referecnced to "d" above
    }
}
