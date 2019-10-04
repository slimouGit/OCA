package _000_Sandbox._003_DasRundeInDasEckige;

public class TestFormsEquality {
    public static void main(String[] args){
        Quadrat q1 = new Quadrat("eckig");
        Quadrat q2 = new Quadrat("eckig");
        Kreis k1 = new Kreis("rund");
        Kreis k2 = new Kreis("rund");

        passtDasZusammen(q1,q2);
        passtDasZusammen(q1,k1);
        passtDasZusammen(k1,k2);
    }

    public static void passtDasZusammen(Form a, Form b) {
        kompabilitaetsTest(a, b);
    }

    public static void kompabilitaetsTest(Form a, Form b) {
        stelleFrage(a, b);
        pruefeKompatibilitaet(a, b);
    }

    public static void stelleFrage(Form a, Form b) {
        System.out.print("Passen die beiden Formen " + a.getForm() + " und " + b.getForm() + " zusammen? ");
    }

    public static void pruefeKompatibilitaet(Form a, Form b) {
        System.out.println(a.getForm().equals(b.getForm()));
    }
}
