package Controller;

import Model.TaskStorage;
import View.ConsoleView;

import java.util.Scanner;

public abstract class Activity {

    private Scanner scanner = new Scanner(System.in);
    protected ConsoleView view = new ConsoleView();

    public String getInput() {
        System.out.print("> ");
        return scanner.nextLine();
    }

    public abstract void show();

}
