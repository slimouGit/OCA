package _003_StringBuilder_delete;

public class StringBuilder_delete {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.delete(4,6)); //01236789

        StringBuilder testSB = new StringBuilder("Alle meine Entchen123");
        System.out.println(testSB);
        System.out.println(testSB.delete(testSB.length()-3,testSB.length()));
        System.out.println(testSB.toString().trim());
    }
}
