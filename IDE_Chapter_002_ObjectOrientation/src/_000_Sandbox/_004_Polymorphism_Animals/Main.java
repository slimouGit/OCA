package _000_Sandbox._004_Polymorphism_Animals;

public class Main {
    public static void main(String[] args){
        System.out.println("Zoo Animal");
        Elefant e1 = new Elefant();
        System.out.println(e1.eating("Grass", 15));
        e1.caressingAnimal(e1);
        e1.sleeping();

        System.out.println("--------------------------------");

        System.out.println("Wild Animal");
        WildBoar wb = new WildBoar();
        System.out.println(wb.eating("Truffle", 10));
        wb.huntingAnimal(wb);
        wb.sleeping();
    }
}
