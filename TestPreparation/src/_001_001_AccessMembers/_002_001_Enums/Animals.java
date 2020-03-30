package _001_001_AccessMembers._002_001_Enums;

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animals(String sound) {
        this.sound = sound;
    }
}
