package Controller.States;

import Model.User;
import View.ConsoleView;

public class HelpPage extends TaskList {

    private User user;

    public HelpPage(User user) {
        super(user);
        this.user = user;
    }

    public void inputH() {}

    public void inputB() {
        user.setState(user.getTaskList());
    }

    public void show() {
        ConsoleView.showHelp();
    }

}