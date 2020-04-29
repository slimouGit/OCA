package _002_14_Interface;

public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args){
        new DontBoilFrogs().go();
    }

    private void go() {
        System.out.println(hop());
        //System.out.println(getCtoF(100)); ACCESS STATIC INTERFACE METHODS ONLY VIA INTERFACE REFERENCE

        DontBoilFrogs dbf = new DontBoilFrogs();
        //System.out.println(dbf.getCtoF(100)); ACCESS STATIC INTERFACE METHODS ONLY VIA INTERFACE REFERENCE

        System.out.println(FrogBoilable.getCtoF(100));

        System.out.println(dbf.hop2());
    }

    @Override
    public String hop2() {
        return "hop2";
    }
}
