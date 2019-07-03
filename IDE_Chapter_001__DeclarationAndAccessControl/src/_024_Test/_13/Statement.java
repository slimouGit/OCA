package _024_Test._13;


import java.util.HashMap;
import java.util.Map;

class Test {

    public static void main(String[] args) {
        System.out.println("true statements:");
        for (Statement item : Statement.values()) {
            if (item.isTruthfull()) {
                System.out.println(item.getStatement());
            }
        }
        System.out.println("----------------------------------");
        System.out.println("wrong statements:");
        for (Statement item : Statement.values()) {
            if (!item.isTruthfull()) {
                System.out.println(item.getStatement());
            }
        }

        Map statements = new HashMap<String, Boolean>();
        for (Statement item : Statement.values()) {
            statements.put(item.getStatement(), item.isTruthfull());
        }

    }

    public enum Statement {
        A("Java is a dynamically typed programming language", false),
        B("Java provides fine-grained control of memory through the use of pointers", false),
        C("Java provides programmers the ability to create objects that are well encapsulated", true),
        D("Java provides programmers the ability to send Java objects from one machine to another", true),
        E("Java is an implementation of the ECMA standard", false),
        F("Java's encapsulation capabilities provide its primary securaty mechanism", false);


        private final String statement;
        private final boolean truthfull;

        Statement(String statement, boolean truthful) {
            this.statement = statement;
            this.truthfull = truthful;
        }

        public String getStatement() {
            return statement;
        }

        public boolean isTruthfull() {
            return truthfull;
        }
    }
}
