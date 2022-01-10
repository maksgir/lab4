package Creatures;

import Place.PlaceInterface;
import Taks.TasksAbstract;

import java.util.Objects;

public class Carlson implements PersonInterface {
    private TasksAbstract task;
    private boolean isWearingBathrobe;
    private boolean isDrinkingChocolate;
    private boolean isEatingBuns;
    private boolean isMouthBusy;
    private boolean isActive;
    private PlaceInterface place;


    @Override
    public void doSomething() {
        System.out.print("Карлсон ");
        wearBathrobe();
        drinkChocolate();
        eatBuns();
    }

    public class Bun {
        private boolean isEaten;

        public void beEaten() {
            System.out.println("плюшку съели");
            isEaten = true;
        }
    }

    public void sitOnBed(PlaceInterface place) {
        this.place = place;
        System.out.printf("Карлсон уселся %s%n", place.toString());
    }

    public PlaceInterface getPlace() {
        return place;
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

    public void putBuns() {
        System.out.print("Карлсон засунул в рот целую плюшку ");
        isMouthBusy = true;

    }

    public String noddle() {
        isActive = true;
        return "и поэтому только энергично закивал";
    }


    public TasksAbstract sayTask() {
        return task;
    }

    public void setTask(TasksAbstract task) {
        this.task = task;
    }

    public void answerBoy(String question) {
        System.out.printf("- %s - удивленно переспросил Малыш.%n", question);
        putBuns();
        System.out.println(sayYes());
    }

    public String sayYes() {
        if (isMouthBusy)
            return noddle();

        return "и ответил да";
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
