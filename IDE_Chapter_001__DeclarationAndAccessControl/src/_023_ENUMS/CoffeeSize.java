package _023_ENUMS;


public enum CoffeeSize {
    BIG(8), HUGE(10), OVERWHELMING(16);
    CoffeeSize(int size){
        this.size = size;
    }

    private int size;

    public int getSize(){
        return size;
    }
}
