package trees.treeimplementation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TreeImplementation treeImplementation = new TreeImplementation();

        Scanner scanner = new Scanner(System.in);
        treeImplementation.insert(scanner);
        treeImplementation.display();
    }
}
