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

    private static void passtDasZusammen(Form a, Form b) {
        System.out.print("Passen die beiden Formen " + a.getForm() + " und " + b.getForm() + " zusammen? ");
        System.out.println(a.getForm().equals(b.getForm()));
    }
}
