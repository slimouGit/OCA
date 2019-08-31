package _024_Test._07;

/**
 * User: salim
 * Date: 31.08.2019 17:00
 */
public class Locomotive {
    Locomotive(){
        main("hi"); //WILL NOT RUN, BECAUSE THERE IS NO INSTANCE OF LOCOMOTIVE
    }

    public static void main(String[] args){
        System.out.println("2 ");
    }

    //IT IS ALLOWED TO OVERRIDE MAIN METHOS
    public static void main(String args) {
        System.out.println("3 " + args);
    }

    //OUTPUT IS 2
}
