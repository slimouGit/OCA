package _015_OverloadedConstructor;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    Animal() {
        this.name = this.makeRandomName();
    }

    static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        return new String[]{"Fritz", "Tanja", "Paul", "Maria", "Jutta"}[x];
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);

        Animal b = new Animal("Terminator Franz");
        System.out.println(b.name);
    }

}
