package _000_Sandbox._005_instanceOf_PatchworkFaimily;

public class TestPatchworkFamily {
    public static void main(String[] args){
        Grandpa grandpa = new Grandpa();
        Vather vather = new Vather();
        Son son = new Son();
        AdoptedDaughter adoptedDaughter = new AdoptedDaughter();

        System.out.println(grandpa instanceof fightWar); //TRUE
        System.out.println(grandpa instanceof Vather); //FALSE
        System.out.println(grandpa instanceof work); //FALSE
        System.out.println(vather instanceof fightWar); //TRUE
        System.out.println(vather instanceof Grandpa); //TRUE
        System.out.println(son instanceof Grandpa); //TRUE
        //System.out.println(adoptedDaughter instanceof Vather); //INCOMPATIBLE TYPE!!!
        System.out.println(adoptedDaughter instanceof work); //TRUE
    }
}
