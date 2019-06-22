package _022_local_instance_variables;

public class TestServer {
    int count = 9;
    public void logIn(){
        int count = 10;
        System.out.println("local variable is " + count);
    }
    public void count(){
        System.out.println("instance variable is " + count);
    }
}
