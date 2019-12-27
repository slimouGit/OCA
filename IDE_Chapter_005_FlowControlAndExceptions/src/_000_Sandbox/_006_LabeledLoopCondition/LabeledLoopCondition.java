package _000_Sandbox._006_LabeledLoopCondition;

public class LabeledLoopCondition {
    public static void main(String[] args) {
        int age = 0;
        int ageOfDeath = 110;
        growUp:
        while (age < ageOfDeath) {
            age++;
            System.out.println("current age " + age);
            if (age == 18) {
                System.out.println("got driverlicense in age of " + age);
                break growUp;
            }
            continue growUp;
        }
    }
}
