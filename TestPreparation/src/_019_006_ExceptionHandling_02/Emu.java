package _019_006_ExceptionHandling_02;

public class Emu {
    static String s = "-";
    public static void main(String[] args){
        try{
            throw new Exception();              //1.
        }catch(Exception e){
            try{
                try{
                    throw new Exception();      //2.
                }catch (Exception ex){
                    s += "ic ";                 //3.
                }
            }catch (Exception x){
                s += "mc ";
            }
            finally {
                s += "mf ";                     //4.
            }
        }finally {
            s += "of ";                         //5.
        }
        System.out.print(s);                    //6.    -ic mf of
    }
}
