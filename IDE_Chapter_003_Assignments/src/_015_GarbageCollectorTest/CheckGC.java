package _015_GarbageCollectorTest;

import java.util.Date;

public class CheckGC {
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " +  rt.totalMemory());
        System.out.println("Before memory: " +  rt.freeMemory());
        Date d  = null;
        for(int i =0;i<10000000;i++){
            d =new Date();
            d = null;
        }
        System.out.println("After memory: " + rt.freeMemory());
        rt.gc();
        System.out.println("After GC memory: " + rt.freeMemory());
    }
    /**
     * OUTPUT
     *
     * Total JVM memory: 64487424   =>  constant
     * Before memory: 62434984      =>  constant
     * After memory: 58414096       =>  NOT constant
     * After GC memory: 63404096    =>  NOT consatnt
     */
}
