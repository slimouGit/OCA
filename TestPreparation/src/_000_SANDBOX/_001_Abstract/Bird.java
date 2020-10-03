package _000_SANDBOX._001_Abstract;

/**
 * User: salim
 * Date: 03.10.2020 07:51
 */
abstract class Bird {
    private void fly(){
        System.out.println("Bird is flying");
    }

    public static void main(String[] args){
        Bird bird = new Pelican();
        bird.fly();

        Pelican pelican = new Pelican();
        pelican.fly();

    }
}
