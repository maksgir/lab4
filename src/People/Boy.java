package People;

import Taks.TasksAbstract;

import java.util.Objects;

public class Boy implements PersonInterface {
    private TasksAbstract task;

    @Override
    public void doSomething() {
        task.complete();
    }

    public void askCarlson(TasksAbstract newTask) {
        System.out.println("Малыш получил задание - " + newTask.getTask());

        this.task = newTask;
    }

    public void askForHelp(FrechenBoch frechen) {
        System.out.println("Малыш просит помощь у Фрекен Бок");
        if (frechen.helpBoy()) {
            System.out.println("Фрекен Бок дала Малышу что он просил");
            doSomething();
        } else {
            System.out.println("Фрекен Бок не дала Малышу что он просил :(");
        }
    }


    @Override
    public String toString() {
        return "Малыш";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boy boy = (Boy) o;
        return Objects.equals(task, boy.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task);
    }
}
