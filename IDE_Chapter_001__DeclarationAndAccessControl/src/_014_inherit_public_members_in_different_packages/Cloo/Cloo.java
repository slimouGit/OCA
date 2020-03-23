package _014_inherit_public_members_in_different_packages.Cloo;


import _014_inherit_public_members_in_different_packages.Roo.Roo;

class Cloo extends Roo {
    public static void main(String[] args){
        Cloo cloo = new Cloo();
        cloo.testCloo();
        Roo roo = new Roo();
        roo.doRooThings();
    }

    public void testCloo() {
        System.out.println(doRooThings());
    }
}


