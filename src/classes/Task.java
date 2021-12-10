package classes;

import util.TasksAbstract;
import util.TasksEnum;

public class Task extends TasksAbstract {
    public Task(TasksEnum task) {
        super(task);
    }

    @Override
    public String toString() {
        return "Задание для малыша";
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
