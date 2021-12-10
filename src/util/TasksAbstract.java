package util;

import util.TasksInterface;

public abstract class TasksAbstract implements TasksInterface {
    private boolean progress; // 0-haven't done 1-done
    private final boolean difficult; //0-easy, 1-hard
    private final TasksEnum task;

    public TasksAbstract(TasksEnum task) {
        this.task = task;
        this.difficult = task.toString().equals("CHOCOLATE") || task.toString().equals("BUNS");

    }

    @Override
    public String getTask() {
        return task.toString();
    }

    @Override
    public boolean isDone() {
        return progress;
    }

    @Override
    public boolean isDifficult() {
        return difficult;
    }

    @Override
    public void complete() {
        progress = true;
    }

}
