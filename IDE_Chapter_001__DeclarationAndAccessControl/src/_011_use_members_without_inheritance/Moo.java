package _011_use_members_without_inheritance;

class Moo {
    public void useAZoo(){
        Zoo z = new Zoo();
        System.out.println("A Zoo says: " + z.coolMethod());
        //the predicting line works, because Moo can access the public method
    }
}