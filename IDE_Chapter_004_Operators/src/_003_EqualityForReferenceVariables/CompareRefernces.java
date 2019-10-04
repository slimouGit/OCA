package _003_EqualityForReferenceVariables;

import javax.swing.*;

public class CompareRefernces {
    public static void main(String[] args){
        JButton a = new JButton("Exit");
        JButton b = new JButton("Exit");
        JButton c = a;
        System.out.println("Is reference a == b " + (a==b));
        System.out.println("Is reference a == c " + (a==c));
    }
    /**
     * OUTPUT
     * Is reference a == b false
     * Is reference a == c true
     */
}
