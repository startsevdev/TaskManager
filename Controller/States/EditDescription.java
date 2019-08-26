package Controller.States;

import Model.User;
import View.ConsoleView;

public class EditDescription extends State {

    private User user;

    public EditDescription(User user) {
        this.user = user;
    }

    public void inputC() {
        System.out.println("Error");
    }

    public void inputR() {
        System.out.println("Error");
    }

    public void inputB() {
        user.setState(user.getTaskPage());
    }

    public void inputT() {
        System.out.println("Error");
    }

    public void inputD() {
        System.out.println("Error");
    }

    public void inputH() {
        inputText("h");
    }

    public void inputNumber(Integer number) {
        System.out.println("Error");
    }

    public void inputText(String text) {
        user.getTask().setDescription(text);
        user.setState(user.getTaskPage());
    }

    public void show() {
        ConsoleView.printLine();
        System.out.println("INPUT DESCRIPTION\n");
    }

}