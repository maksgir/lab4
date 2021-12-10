package classes;

import util.Clothes;
import util.PersonInterface;

public class Carlson implements PersonInterface {
    private Task task;


    @Override
    public void doSomething() {

        System.out.print("Карлсон уже сидел в белом купальном халате в постели Малыша,");
        System.out.print(" пил обжигающий шоколад и с аппетитом ел плюшки,");
        System.out.print(" а в ванной комнате были развешаны для просушки его ");
        for (Clothes x : Clothes.values()) {
            switch (x.toString()) {
                case "SHIRTS":
                    System.out.print("рубашки, ");
                    break;
                case "PANTS":
                    System.out.print("штаны, ");
                    break;
                case "SOCKS":
                    System.out.print("носки");
                    break;
                case "SNEAKERS":
                    System.out.print("и даже башмаки.");
                    break;
            }
        }
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Task sayTask() {
        return task;
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
