package Controller;

import Model.TaskStorage;

public class TasksListActivity extends Activity {

    private TaskStorage storage;

    public TasksListActivity(TaskStorage storage) {
        this.storage = storage;
    }

    public void show() {
        view.showTaskList(storage.getTasks());
    }

}