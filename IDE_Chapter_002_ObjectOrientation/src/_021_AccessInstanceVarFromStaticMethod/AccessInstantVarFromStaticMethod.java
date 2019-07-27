package _021_AccessInstanceVarFromStaticMethod;

public class AccessInstantVarFromStaticMethod {

    int frogSize = 0;
    public int getFrogSize(){
        return frogSize;
    }
    public AccessInstantVarFromStaticMethod(int s){
        frogSize = s;
    }

    public static void main(String[] args){
        AccessInstantVarFromStaticMethod af = new AccessInstantVarFromStaticMethod(42);
        System.out.println("Instance frogsize is: " + af.getFrogSize());
        System.out.println("Instance frogsize is: " + af.frogSize);
    }
}
