package _001_001_AccessMembers._002_001_Enums;

public class TestEnum {
    static Animals a;

    public static void main(String[] args){
        System.out.println(a.DOG.sound + " " + a.FISH.sound); //woof burble
    }
}
