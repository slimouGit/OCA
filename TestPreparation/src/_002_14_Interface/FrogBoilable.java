package _002_14_Interface;

public interface FrogBoilable {
    static int getCtoF(int cTemp){
        return (cTemp * 9/5)+32;
    }
    default String hop(){return "hopping ";}

    String hop2();
}
