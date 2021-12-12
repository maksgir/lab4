package People;

import Taks.TasksAbstract;

public class Carlson implements PersonInterface {
    private TasksAbstract task;
    private boolean isWearingBathrobe;
    private boolean isDrinkingChocolate;
    private boolean isEatingBuns;


    @Override
    public void doSomething() {
        System.out.print("Карлсон ");
        wearBathrobe();
        drinkChocolate();
        eatBuns();
    }

    public void wearBathrobe() {
        isWearingBathrobe = true;
        System.out.print("сидел в белом купальном халате, ");
    }

    public void drinkChocolate() {
        isDrinkingChocolate = true;
        System.out.print("пил обжигающий шоколад ");
    }

    public void eatBuns() {
        isEatingBuns = true;
        System.out.println("и с аппетитом ел плюшки");
    }


    public TasksAbstract sayTask() {
        return task;
    }

    public void setTask(TasksAbstract task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Человек Карлсон";
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
