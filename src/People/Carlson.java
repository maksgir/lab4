package People;

import Taks.TasksAbstract;

import java.util.Objects;

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
        return "Карлсон";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carlson carlson = (Carlson) o;
        return isWearingBathrobe == carlson.isWearingBathrobe && isDrinkingChocolate == carlson.isDrinkingChocolate && isEatingBuns == carlson.isEatingBuns && Objects.equals(task, carlson.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, isWearingBathrobe, isDrinkingChocolate, isEatingBuns);
    }
}
