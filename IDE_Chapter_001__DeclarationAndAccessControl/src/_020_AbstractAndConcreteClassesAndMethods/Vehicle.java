package _020_AbstractAndConcreteClassesAndMethods;

abstract class Vehicle {
    private String type;
    abstract void goUpHill();
    public String getType(){
        return this.type;
    }
}
