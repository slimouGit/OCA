package _005_PrimitiveInstanceVariables;

public class PrimitiveInstanceVariables {
    int year;
    String month;
    float time;

    public static void main(String[] args){
        PrimitiveInstanceVariables piv = new PrimitiveInstanceVariables();
        piv.showYearValue();
    }

    private void showYearValue() {
        System.out.println("Year: " + this.year + " Month: " + this.month + " Time: " + this.time);
    }
    //OUTPUT: Year: 0 Month: null Time: 0.0
}

