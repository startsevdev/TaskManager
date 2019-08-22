package Controller;

import java.util.Scanner;


public class Input {

    private String string;
    private boolean isInteger;

    private Scanner scanner = new Scanner(System.in);

    public Input() {
        string = this.get();
        isInteger = isInteger(string);
    }

    private String get() {
        System.out.print("> ");
        return scanner.nextLine();
    }

    private boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public String getString() {
        return string;
    }

    public boolean isInteger() {
        return isInteger;
    }
}
