package _024_Test._14;

interface FrogBoilable {
    static int getCtoF(int cTemp){
        return (cTemp * 9 / 5) + 32;
    }
    default String hop(){
        return "hopping ";
    }
}
