package _004_StringBuilder_insert;

public class StringBuilder_insert {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.insert(4,"---")); //0123---456789
    }
}
