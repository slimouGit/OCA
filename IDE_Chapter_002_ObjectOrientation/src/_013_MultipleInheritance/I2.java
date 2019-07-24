package _013_MultipleInheritance;

public interface I2 {
    default int doStuff(){
        return 1;
    }

    default String doUniqueStuff(){
        return "I am unique an need not to be overridden";
    }
}
