import Clothes.*;
import People.Boy;
import People.Carlson;
import People.FrechenBoch;
import People.UncleJulius;
import Taks.BathrobeTask;
import Taks.BunsTask;
import Taks.ChocolateTask;
import Taks.ClothesTask;

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
        boy.doTask();

        ChocolateTask chocolate = new ChocolateTask("CHOCOLATE");
        carlson.setTask(chocolate);
        boy.askCarlson(carlson.sayTask());
        boy.askForHelp(frechen);

        BunsTask buns = new BunsTask("BUNS");
        carlson.setTask(buns);
        boy.askCarlson(carlson.sayTask());
        boy.askForHelp(frechen);

        Shirt shirt = new Shirt(carlson, TypeEnum.SHIRTS);
        Pants pants = new Pants(carlson, TypeEnum.PANTS);
        Socks socks = new Socks(carlson, TypeEnum.SOCKS);
        Sneakers sneakers = new Sneakers(carlson, TypeEnum.SNEAKERS);

        ClothesAbstract[] clothes = {shirt, pants, socks, sneakers};
        ClothesTask clothesTask = new ClothesTask("CLOTHES", clothes);
        carlson.setTask(clothesTask);
        boy.askCarlson(carlson.sayTask());
        boy.doTask();


        try {
            Thread.sleep(2000);
            System.out.print("Несколько минут спустя ");
            carlson.doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
