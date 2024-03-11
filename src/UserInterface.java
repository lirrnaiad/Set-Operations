import java.util.Scanner;
import java.util.HashSet;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Enter the elements of the sets, separate using a blank space ( )");
        String elements;

        SetBuilder firstSet = new SetBuilder();
        System.out.print("Set 1: ");
        elements = scanner.nextLine();
        firstSet.populateSet(elements);

        SetBuilder secondSet = new SetBuilder();
        System.out.print("Set 2: ");
        elements = scanner.nextLine();
        secondSet.populateSet(elements);
        System.out.println();

        System.out.println("Union: " + firstSet.union(secondSet));
        System.out.println("Intersection: " + firstSet.intersection(secondSet));
    }
}
