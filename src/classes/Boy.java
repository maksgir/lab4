package classes;

import util.PersonInterface;

public class Boy implements PersonInterface {
    private Task task;

    @Override
    public void doSomething() {
        System.out.println();
        strive();
    }

    public void strive() {    //кинулся
        System.out.print("Малыш со всех ног кинулся делать все то");
        System.out.println(", что по мнению Карлсона, надо было сделать в этом случае для своего лучшего друга.");
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void doTask() {
        System.out.print("Малыш сейчас занимается ");
        switch (task.getTask()) {
            case "BATHROBE":
                System.out.println("поиском купательного халата");
                break;
            case "CHOCOLATE":
                System.out.println("поиском тёплого шоколада");
                break;
            case "BUNS":
                System.out.println("поиском плюшек");
                break;
            case "CLOTHES":
                System.out.println("развешиванием вещей");
                break;
        }
        if (task.isDifficult()) {
            System.out.println("Это не так то просто, нужно попросить у Фрекен Бок");
        } else {
            System.out.println("Это задание легкое");
            completeTask();
        }

    }

    public void completeTask() {
        System.out.println("Задание выполнено");
        task.complete();
    }

    public boolean askFrechenBoch() {
        return task.isDifficult();
    }

    @Override
    public String toString() {
        return "Человек Малыш";
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
