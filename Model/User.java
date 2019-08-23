package Model;

import Controller.States.*;

public class User {

    private State taskList;
    private State createTask;
    private State taskPage;
    private State editTitle;
    private State editDescription;

    private State state;
    private String taskDescription;
    private TaskStorage storage;
    private Task task;
    private Integer taskIndex;

    public User(TaskStorage taskStorage) {

        taskList = new TaskList(this);
        taskPage = new TaskPage(this);
        createTask = new CreateTask(this);
        editTitle = new EditTitle(this);
        editDescription = new EditDescription(this);

        storage = taskStorage;
        taskIndex = null;
        task = null;
        state = taskList;

    }

    public TaskStorage getStorage() {
        return storage;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Integer getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(Integer taskIndex) {
        this.taskIndex = taskIndex;
    }

    public State getTaskList() {
        return taskList;
    }

    public State getCreateTask() {
        return createTask;
    }

    public State getTaskPage() {
        return taskPage;
    }

    public State getEditTitle() {
        return editTitle;
    }

    public State getEditDescription() {
        return editDescription;
    }
}
