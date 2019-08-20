package Model;

import View.ConsoleView;

import java.util.ArrayList;


public class TaskStorage {

    private ConsoleView view = new ConsoleView();
    private ArrayList<Task> tasks = new ArrayList<>();

    public Task createTask(String name) {

        Task task = new Task(name);
        tasks.add(task);

        return task;

    }

    public Task createTask(String name, String description) {

        Task task = new Task(name, description);
        tasks.add(task);

        return task;

    }

    public Task get(int index) {
        return (Task) tasks.get(index);
    }

    public Task remove(int index) {
        return tasks.remove(index);
    }

    public void show() {
        view.showTasks(tasks);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

}
