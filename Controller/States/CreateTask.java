package Controller.States;

import Model.Task;
import Model.User;

public class CreateTask extends State {

    private User user;

    public CreateTask(User user) {
        this.user = user;
    }

    public void inputC() {
        System.out.println("Error");
    }

    public void inputR() {
        System.out.println("Error");
    }

    public void inputB() {
        user.setState(user.getTaskList());
    }

    public void inputNumber(Integer number) {
        System.out.println("Error");
    }

    public void show() {
        System.out.println("CREATING NEW TASK. INPUT TITLE\n");
    }

    public void inputT() {
        System.out.println("Error");
    }

    public void inputD() {
        System.out.println("Error");
    }

    public void inputP() {
        System.out.println("Error");
    }

    public void inputText(String text) {
        user.getStorage().createTask(text);

        user.setTask(user.getStorage().getLast());
        user.setTaskIndex(user.getStorage().getSize() - 1);

        user.setState(user.getEditDescription());
    }

}
