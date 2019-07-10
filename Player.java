import java.util.*;
public class Player {
    private String name;

    public Player() {
        System.out.println("What is your name?");
        System.out.print("> ");
        var scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}