import Clothes.*;
import People.*;
import Taks.*;

public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Carlson carlson = new Carlson();
        FrechenBoch frechen = new FrechenBoch();
        UncleJulius uncle = new UncleJulius();
        uncle.doSomething();
        uncle.sayFrechen(frechen);

        BathrobeTask bathrobe = new BathrobeTask("BATHROBE");
        carlson.setTask(bathrobe);
        boy.askCarlson(carlson.sayTask());
        boy.doSomething();

        ChocolateTask chocolate = new ChocolateTask("CHOCOLATE");
        carlson.setTask(chocolate);
        boy.askCarlson(carlson.sayTask());
        boy.askForHelp(frechen);

        BunsTask buns = new BunsTask("BUNS");
        carlson.setTask(buns);
        boy.askCarlson(carlson.sayTask());
        boy.askForHelp(frechen);

        Shirt shirt = new Shirt(carlson);
        Pants pants = new Pants(carlson);
        Socks socks = new Socks(carlson);
        Sneakers sneakers = new Sneakers(carlson);

        ClothesAbstract[] clothes = {shirt, pants, socks, sneakers};
        ClothesTask clothesTask = new ClothesTask("CLOTHES", clothes);
        carlson.setTask(clothesTask);
        boy.askCarlson(carlson.sayTask());
        boy.doSomething();


        try {
            Thread.sleep(2000);
            System.out.print("Несколько минут спустя ");
            carlson.doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
