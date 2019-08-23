import Controller.Cycle;
import Model.TaskStorage;

public class Main {

    public static void main(String[] args) {

        TaskStorage storage = new TaskStorage();

        storage.createTask("Do Something");
        storage.createTask("Task 2", "Description 2");
        storage.createTask("Task 3", "Description 3");

        Cycle cycle = new Cycle(storage);
        cycle.run();

    }

}
