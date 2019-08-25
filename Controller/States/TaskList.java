package Controller.States;

import Model.Exceptions.InvalidTaskNumberException;
import Model.Exceptions.EmptyStorageException;
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
        try {
            checkTaskIndex(number);

            user.setState(user.getTaskPage());
            user.setTaskIndex(number - 1);
            user.setTask(user.getStorage().get(number - 1));
        }
        catch (EmptyStorageException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidTaskNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public void inputC() {
        user.setState(user.getCreateTask());
    }

    public void inputR() {
        System.out.println("Error");
    }

    public void inputB() {
        System.out.println("Error");
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
        System.out.println("Error");
    }

    private void checkTaskIndex(Integer index) throws InvalidTaskNumberException, EmptyStorageException {
        if (user.getStorage().getSize() == 0) {
            throw new EmptyStorageException();
        }
        else if (index > user.getStorage().getSize() || index < 1) {
            throw new InvalidTaskNumberException();
        }
    }

}
