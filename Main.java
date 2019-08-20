import Controller.Activity;
import Controller.TasksListActivity;
import Model.Task;
import Model.TaskStorage;

public class Main {

    public static void main(String[] args) {

        TaskStorage storage = createStorage();

        storage.createTask("Do Something");
        storage.createTask("Task 2", "Description 2");
        storage.createTask("Task 3", "Description 3");

        storage.get(0).setDescription("Easy");
        storage.get(0).setStatus(Task.Status.DONE);

        Activity tasksList = new TasksListActivity(storage);
        tasksList.show();

    }

    private static TaskStorage createStorage() {

        return new TaskStorage();

    }

}
