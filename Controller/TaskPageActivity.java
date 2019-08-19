package Controller;

import Model.Task;

public class TaskPageActivity extends Activity {

    private Task task;

    public TaskPageActivity(Task task) {
        this.task = task;
    }

    public void show() {
        view.showTask(task);
    }

}
