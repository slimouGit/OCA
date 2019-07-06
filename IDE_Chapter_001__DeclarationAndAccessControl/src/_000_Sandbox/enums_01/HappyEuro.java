package _000_Sandbox.enums_01;


public enum HappyEuro {
    MIETE(HE_Type.OUT, "Miete", 800.00), STROM(HE_Type.OUT, "Strom",65.0), PARKPLATZ(HE_Type.IN, "Parkplatz", 50.0);


    private HE_Type type;
    private String position;
    private Double amount;

    HappyEuro(HE_Type type, String position, Double amount) {
        this.type = type;
        this.position = position;
        this.amount = amount;
    }

    public HE_Type getType() {
        return type;
    }

    public String getPosition() {
        return position;
    }

    public Double getAmount() {
        return amount;
    }
}
