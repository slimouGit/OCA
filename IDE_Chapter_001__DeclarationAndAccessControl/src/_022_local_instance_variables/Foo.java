package _022_local_instance_variables;

public class Foo {
    int size = 27;

    public void manipulateSize(int size){
        System.out.println("instance size: " + this.size);
        this.size = size;
        System.out.println("manipulated size: " + size);
    }
}
