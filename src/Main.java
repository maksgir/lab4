import Clothes.*;
import Creatures.*;
import Exceptions.UncleIsNotComingException;
import Taks.*;
import Place.Bed;
import Time.Time;

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

        System.out.printf("%n lab4-----------%n%n");

        Bed bed = new Bed(boy);
        bed.takePlace();
        Bed.Headboard headboard = bed.new Headboard();
        headboard.takePlace();

        Time time = new Time();
        time.setTime("всю ночь");

        SittingTask sitting = new SittingTask("BED", headboard, time);
        carlson.sitOnBed(bed);
        carlson.setTask(sitting);
        Carlson.Bun bun = carlson.new Bun();
        boy.askCarlson(carlson.sayTask());

        boy.worry();
        carlson.answerBoy(boy.ensureAboutTheTime(time.getTime()));
        bun.beEaten();

        Dog bimbo = new Dog() {
            public boolean isDisappointed;
            public boolean isMakingNoise;

            public void disappoint() {
                isDisappointed = true;
                System.out.println("Бимбо не нравилось, что Карлсон лежал в постели Малыша.");
                bark();
            }

            @Override
            public void bark() {
                isMakingNoise = true;
                System.out.println("Он надрывался от лая");
            }

        };

        if (carlson.getPlace().getOwner().equals(boy)) {
            bimbo.disappoint();
        }


    }
}
