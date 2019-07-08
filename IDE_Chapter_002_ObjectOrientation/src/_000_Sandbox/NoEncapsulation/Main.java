package _000_Sandbox.NoEncapsulation;


public class Main {
    public int left = 9;
    public int right = 8;

    public void setLeft(int leftNum){
        left = leftNum ;
        right = leftNum/3;
    }

    public static void main(String[] args){
        Main m = new Main();
        System.out.println(m.left);
        System.out.println(m.right);

        m.setLeft(9);

        System.out.println(m.left);
        System.out.println(m.right);
    }
}
