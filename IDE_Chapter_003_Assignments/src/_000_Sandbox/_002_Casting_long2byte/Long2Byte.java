package _000_Sandbox._002_Casting_long2byte;

public class Long2Byte {
    public static void main(String[] args){
        long l1 = 126L;
        byte b1 = (byte)l1;
        System.out.println(b1); //126

        long l2 = 128L;
        byte b2 = (byte)l2;
        System.out.println(b2); //-128

        long l3 = 130L;
        byte b3 = (byte)l3;
        System.out.println(b3); //-126
    }
}
