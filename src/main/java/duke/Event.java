package duke;

public class Event extends Task{
    private static String taskType = "EVENT";
//    private String startTime;
//    private String endTime;
    private String eventTime;

    public Event(String description, String eventTime) {
        super(description);
        this.eventTime = eventTime;
    }

    public Event(String description, String eventTime, boolean isDone) {
        super(description, isDone);
        this.eventTime = eventTime;
    }

    public String getTaskType() {
        return taskType;
    }

    public String getEventTime() {
        return eventTime;
    }
}