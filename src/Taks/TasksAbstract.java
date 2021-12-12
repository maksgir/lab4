package Taks;

import Taks.TasksInterface;

public abstract class TasksAbstract implements TasksInterface {
    private boolean progress; // 0-haven't done 1-done
    private final boolean difficult; //0-easy, 1-hard
    private final String name;

    public TasksAbstract(String name) {
        this.name = name;
        this.difficult = name.equals("CHOCOLATE") || name.equals("BUNS");

    }

    public abstract void complete();

    public void finish(){
        System.out.println("Задание выполнено");
        progress = true;
    }


    @Override
    public String getTask() {
        return name;
    }

    @Override
    public boolean isDone() {
        return progress;
    }

    @Override
    public boolean isDifficult() {
        return difficult;
    }


}
