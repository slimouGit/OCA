package _000_Sandbox.enums_01;


public class Main {
    static HappyEuro he;

    public static void main(String[] args) {
        //Value from static
        System.out.println(he.MIETE.getAmount());

        //value direct from enum
        System.out.println(HappyEuro.MIETE.getAmount());

        //loop over enum
        for (HappyEuro happyEuro : HappyEuro.values()) {
            System.out.println(happyEuro.getType().getTypeValue() + " " + happyEuro.getPosition() + " " + happyEuro.getAmount());
        }
    }
}
