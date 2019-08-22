package View;

import Model.Task;
import Model.TaskStorage;

public class ConsoleView {

    public void printLine() {
        System.out.println("------------------------------");
    }

    public void showTask(Task task) {
        printLine();
        System.out.println("TASK\n");
        System.out.println("Status: " + task.getStatus());
        System.out.println("Title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription() + "\n");
    }

    public void showTasks(TaskStorage storage) {
        printLine();

        for(Object task : storage.getTasks()) {
            showTask((Task) task);
            printLine();
        }
    }

    public void showTaskList(TaskStorage storage) {
        printLine();
        System.out.println("YOUR TASKS\n");
        for(int i = 0; i < storage.getTasks().size(); i++) {
            Task task = storage.getTasks().get(i);
            System.out.println(i + 1 + ") " + task.getTitle() + "    " + task.getStatus());
        }
        System.out.println();
    }
}
