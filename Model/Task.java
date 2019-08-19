package Model;

import View.ConsoleView;

public class Task {

    public enum Status {
        TO_DO,
        IN_PROGRESS,
        DONE;
    }

    private ConsoleView view = new ConsoleView();

    private String title;
    private String description;
    private Status status;

    public Task(String title) {
        this.title = title;
        description = "-";
        status = Status.TO_DO;
    }

    public Task(String title, String description) {
        this(title);
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void show() {
        view.showTask(this);
    }
}
