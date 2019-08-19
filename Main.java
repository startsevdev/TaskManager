import Controller.Activity;
import Controller.TasksListActivity;
import Model.Task;
import Model.TaskStorage;

public class Main {

    public static void main(String[] args) {

        TaskStorage storage = new TaskStorage();

        Task task1 = new Task("Do Something");
        Task task2 = new Task("TaskPageActivity 2", "Description 2");
        Task task3 = new Task("TaskPageActivity 3", "Description 3");

        storage.add(task1);
        storage.add(task2);
        storage.add(task3);

        storage.get(0).setDescription("Easy");

        task1.setStatus(Task.Status.DONE);

        Activity tasksList = new TasksListActivity(storage);
    }

}
