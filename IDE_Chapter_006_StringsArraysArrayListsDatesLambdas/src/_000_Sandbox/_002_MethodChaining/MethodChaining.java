package _000_Sandbox._002_MethodChaining;

public class MethodChaining {
    public static void main(String[] args){
        String x = "abc";
        String y = x.concat("def").toUpperCase().replace('C','x');
        System.out.println(y); //ABxDEF
    }
}
