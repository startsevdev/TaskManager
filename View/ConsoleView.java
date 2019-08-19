package View;

import Model.Task;

import java.util.ArrayList;

public class ConsoleView {

    private String LINE = "--------------------";

    public void showTask(Task task) {
        System.out.println("Title: " + task.getTitle() + "    " + "Status: " + task.getStatus() + "\n");
        System.out.println("Description: \n" + task.getDescription() + "\n");
    }

    public void showTasks(ArrayList tasks) {
        System.out.println(LINE);

        for(Object task : tasks) {

            showTask((Task) task);
            System.out.println(LINE);
        }
    }

    public void showTaskList(ArrayList<Task> tasks) {
        for(int i = 0; i < tasks.size(); i++) {

            Task task = tasks.get(i);

            System.out.println(i + 1 + ") " + task.getTitle() + "    " + task.getStatus());
        }
    }
}
