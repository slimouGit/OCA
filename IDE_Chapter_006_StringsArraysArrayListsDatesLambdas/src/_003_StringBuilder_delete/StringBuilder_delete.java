package _003_StringBuilder_delete;

public class StringBuilder_delete {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.delete(4,6)); //01236789
    }
}
