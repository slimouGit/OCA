package _013_GarbageTruck;

public class GarbageTruck {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        //sb is not eligible for garbage collection now
        sb = null;
        //now sb is eligible for garbage collection
    }
}
