package strings.rotatestring796;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        RotateString rotateString = new RotateString();

        String s = "abcde";
        String goal = "cdeba";
        System.out.println(rotateString.rotateString2(s, goal));
    }
}
