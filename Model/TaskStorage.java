package Model;

import View.ConsoleView;

import java.util.ArrayList;


public class TaskStorage {

    private ConsoleView view = new ConsoleView();
    private ArrayList<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public Task get(int index) {
        return (Task) tasks.get(index);
    }

    public void remove(int index) {
        tasks.remove(index);
    }

    public void show() {
        view.showTasks(tasks);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

}
