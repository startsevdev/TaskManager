package Controller.States;

import Model.User;

public class TaskList extends State {

    private User user;

    public TaskList(User user) {
        this.user = user;
    }

    public void show() {
        view.showTaskList(user.getStorage());
    }

    public void inputNumber(Integer number) {
        user.setState(user.getTaskPage());
        user.setTaskIndex(number - 1);
        user.setTask(user.getStorage().get(number - 1));
    }

    public void inputC() {
        user.setState(user.getCreateTask());
    }

    public void inputR() {
        System.out.println("Error");
    }

    public void inputB() { }

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
        System.out.println("Error");
    }

}
