package Controller.States;

import Model.User;

public class TaskPage extends State {

    private User user;

    public TaskPage(User user) {
        this.user = user;
    }

    public void show() {
        view.showTask(user.getTask());
    }

    public void inputNumber(Integer number) {
        System.out.println("Error");
    }

    public void inputC() {
        System.out.println("Error");
    }

    public void inputR() {
        user.getStorage().remove(user.getTaskIndex());
        user.setState(user.getTaskList());
    }

    public void inputB() {
        user.setState(user.getTaskList());
    }

    public void inputT() {
        user.setState(user.getEditTitle());
    }

    public void inputD() {
        user.setState(user.getEditDescription());
    }

    public void inputText(String text) {
        System.out.println("Error");
    }

}
