package _022_local_instance_variables;


public class Main {
    public static void main(String[] args){
        new TestServer().logIn();
        new TestServer().count();

        new Foo().manipulateSize(42);
    }
}
