import Clothes.*;
import Creatures.*;
import Exceptions.IncorrectTaskNameException;
import Exceptions.UncleIsNotComingException;
import Taks.*;

public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Carlson carlson = new Carlson();
        FrechenBoch frechen = new FrechenBoch();
        UncleJulius uncle = new UncleJulius();

        uncle.doSomething();
        try {
            uncle.sayFrechen(frechen);
        } catch (UncleIsNotComingException e) {
            System.out.println(e.getMessage());
            frechen.relax();
        }


        try {
            BathrobeTask bathrobe = new BathrobeTask("BATHROBE");
            carlson.setTask(bathrobe);
            boy.askCarlson(carlson.sayTask());
            boy.doSomething();
        } catch (IncorrectTaskNameException e) {
            System.out.println(e.getMessage());
            System.out.println("Задание не может быть выполнено");
        }

        try {
            ChocolateTask chocolate = new ChocolateTask("CHOCOLATE");
            carlson.setTask(chocolate);
            boy.askCarlson(carlson.sayTask());
            boy.askForHelp(frechen);
        } catch (IncorrectTaskNameException e) {
            System.out.println(e.getMessage());
            System.out.println("Задание не может быть выполнено");
        }
        try {
            BunsTask buns = new BunsTask("BUNS");
            carlson.setTask(buns);
            boy.askCarlson(carlson.sayTask());
            boy.askForHelp(frechen);
        } catch (IncorrectTaskNameException e) {
            System.out.println(e.getMessage());
            System.out.println("Задание не может быть выполнено");
        }


        Shirt shirt = new Shirt(carlson);
        Pants pants = new Pants(carlson);
        Socks socks = new Socks(carlson);
        Sneakers sneakers = new Sneakers(carlson);

        try {
            ClothesAbstract[] clothes = {shirt, pants, socks, sneakers};
            ClothesTask clothesTask = new ClothesTask("CLOTHES", clothes);
            carlson.setTask(clothesTask);
            boy.askCarlson(carlson.sayTask());
            boy.doSomething();
        } catch (IncorrectTaskNameException e) {
            System.out.println(e.getMessage());
            System.out.println("Задание не может быть выполнено");
        }

        try {
            Thread.sleep(2000);
            System.out.print("Несколько минут спустя ");
            carlson.doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%n lab4-----------%n%n");

        SittingTask sitting = new SittingTask("BED", "у изголовья кровати Карлсона", "всю ночь");
        carlson.setTask(sitting);
        Carlson.Bun bun = carlson.new Bun();
        boy.askCarlson(carlson.sayTask());

        boy.worry();
        carlson.answerBoy(boy.ensureAboutTheTime());
        bun.beEaten();

        Dog bimbo = new Dog() {
            public boolean isDisappointed;

            @Override
            public void bark() {
                isDisappointed = true;
                System.out.println("Бимбо надрывался от лая");
            }

        };

        bimbo.bark();

    }
}
