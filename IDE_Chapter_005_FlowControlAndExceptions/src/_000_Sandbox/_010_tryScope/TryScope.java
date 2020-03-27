package _000_Sandbox._010_tryScope;

public class TryScope {
    static int thrower() throws Exception{
        return 42;
    }
    public static void main(String[] args){
        try{
            int x = thrower();
        } catch (Exception e) {
           // x++;
        }finally {
           // System.out.print("x = "+ ++x);
        }

    }

    /**
     * x is only in the scope within the try block
     */
}
