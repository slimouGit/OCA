package _036_Interfaces;

/**
 * User: salim
 * Date: 07.10.2020 19:22
 */
interface I1 {
    final int a = 10;
    static int b = 20;
    int c = 30;
    public int d = 40;

    void display();

    default void displayDefault(){
        System.out.println("displayDefault");
    }
}
