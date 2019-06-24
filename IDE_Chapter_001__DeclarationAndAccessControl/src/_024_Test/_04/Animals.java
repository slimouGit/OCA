package _024_Test._04;


enum Animals {
    DOG("woof"), CAT("miao"), FISH("burble");
    String sound;
    Animals(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }
}
