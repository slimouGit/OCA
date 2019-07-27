package _017_InitialitionBlocks;

public class SmallInit {
    static int x;
    int y;

    /**
     * STATIC INIT BLOCK
     * RUNS ONCE WHEN THE CLASS IS  LOADED
     */
    static  { x = 7;}


    /**
     * INSTANCE INIT BLOCK
     * RUNS ONCE EVERYTIME A NEW INSTANCE IS SCREATED
     */
    {y=8;}

    int giveMeInstancedValue(){
        return y;
    }

    public static void main(String[] args){
        System.out.println("from static init block " + x);

        System.out.println("from instance init block " + new SmallInit().giveMeInstancedValue());
    }
}
