package _004_7_EnumsLoopsTernary;

public class McGee {
    public static void main(String[] args){
        Days d1 = Days.TH;
        Days d2 = Days.M;

        for(Days d:Days.values()){
            if(d.equals(Days.F)) break;
            d2 = d;
        }
        System.out.print((d1==d2)?"same old":"newly new");  //same old
    }
    enum Days {M,T,W,TH,F,SA,SU};
}
