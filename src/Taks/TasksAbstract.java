package Taks;

import Exceptions.IncorrectTaskNameException;
import Taks.TasksInterface;

import java.util.Objects;

public abstract class TasksAbstract implements TasksInterface {
    private boolean progress; // 0-haven't done 1-done
    private final boolean difficult; //0-easy, 1-hard
    private final String name;
    private String time;
    private String place;

    public TasksAbstract(String name) {

        if (name != null) {
            this.name = name;
        } else {
            throw new IncorrectTaskNameException("Название задания не может быть null!");
        }
        this.difficult = name.equals("CHOCOLATE") || name.equals("BUNS");

    }

    public abstract void complete();


    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return this.place;
    }

    public void finish() {
        System.out.println("Задание выполнено");
        progress = true;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
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

    @Override
    public String toString() {
        String done = isDone() ? "выполнено" : "невыполнено";
        String dif = isDifficult() ? "сложное" : "легкое";
        return "Задание" +
                done + ", " +
                dif +
                ", название='" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksAbstract that = (TasksAbstract) o;
        return progress == that.progress && difficult == that.difficult && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, difficult, name);
    }
}
