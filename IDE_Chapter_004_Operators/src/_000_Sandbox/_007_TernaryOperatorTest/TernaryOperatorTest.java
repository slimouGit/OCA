package _000_Sandbox._007_TernaryOperatorTest;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        double jahresAusgaben = 75000;
        double jahresEinkommen = 90000;

        System.out.println(pruefeUeberlebensChanceAnhandEinkommen(jahresEinkommen, jahresAusgaben));
        System.out.println(pruefeUeberlebensChanceAnhandEinkommen(50000, 60000));

        System.out.println(pruefeUeberlebensChanceAnhandEinkommenUndZeigeStatus(jahresEinkommen, jahresAusgaben));
        System.out.println(pruefeUeberlebensChanceAnhandEinkommenUndZeigeStatus(81000, 82000));
        System.out.println(pruefeUeberlebensChanceAnhandEinkommenUndZeigeStatus(50000, 52000));
    }


    private static String pruefeUeberlebensChanceAnhandEinkommen(double jahresEinkommen, double jahresAusgaben) {
        return (jahresAusgaben < jahresEinkommen) ? "Gute Überlebenschancen" : "Such Dir einen Nebenjob";
    }

    private static String pruefeUeberlebensChanceAnhandEinkommenUndZeigeStatus(double jahresEinkommen, double jahresAusgaben) {
        return (jahresAusgaben < jahresEinkommen) ? "Das Geld reicht aus" : (jahresEinkommen > 80000) ? "Du verdienst sehr gut, lebst aber über Deine Verhältnisse" : "Du brauchst einen Nebenjob";
    }

    /**
     * OUTPUT
     * Gute Überlebenschancen
     * Such Dir einen Nebenjob
     * Das Geld reicht aus
     * Du verdienst sehr gut, lebst aber über Deine Verhältnisse
     * Du brauchst einen Nebenjob
     */
}
