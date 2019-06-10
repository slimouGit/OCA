package _014_inherit_public_members_in_different_packages.notcert;


import _014_inherit_public_members_in_different_packages.cert.Roo;

class Cloo extends Roo {
    public static void main(String[] args){
        Cloo cloo = new Cloo();
        cloo.testCloo();
    }

    public void testCloo() {
        System.out.println(doRooThings());
    }
}


