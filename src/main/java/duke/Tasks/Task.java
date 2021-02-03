package duke.Tasks;

public class Task {
    private static String taskType = "TASK";
    private String taskDescription;
    private boolean isDone;

    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
        this.isDone = false;
    }

    public Task(String taskDescription, boolean isDone) {
        this.taskDescription = taskDescription;
        this.isDone = isDone;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskType() {
        return taskType;
    }

    // public Task setIsDone(boolean done) {
    //
    //     return new Task(this.taskDescription, done);
    // }

    public void setIsDone(boolean done) {
        this.isDone = done;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

}