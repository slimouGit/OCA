package _000_Sandbox._007_Casting_missmatches;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Cat cat = (Cat) animal;
        animal.makeNoise();//NOT POSSIBLE COMPILER ERROR => NO UPCASTING PLEASE

        /**
         * COMIPILER SAYS NONO, BEFORE COMPILING
        String s = (String) animal;
         */
    }
}
