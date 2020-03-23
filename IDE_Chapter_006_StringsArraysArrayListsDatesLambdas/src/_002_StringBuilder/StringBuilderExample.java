package _002_StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("sb "+ sb + "*");
        sb.append("def");
        System.out.println("sb "+ sb);

        sb.append("321").reverse().insert(3, ": ");
        System.out.println("sb "+ sb);
    }
}
