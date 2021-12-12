package Taks;

import Clothes.ClothesAbstract;

public class ClothesTask extends TasksAbstract {
    private ClothesAbstract[] clothes;

    public ClothesTask(String name, ClothesAbstract[] clothes) {
        super(name);
        this.clothes = clothes;
    }

    @Override
    public void complete() {
        for (ClothesAbstract thing : clothes) {
            thing.dry();
            String name = thing.getType();
            switch (name) {
                case "SHIRTS": {
                    name = "рубашка";
                    break;
                }
                case "PANTS": {
                    name = "штаны";
                    break;
                }
                case "SOCKS": {
                    name = "носки";
                    break;
                }
                case "SNEAKERS": {
                    name = "кроссовки";
                    break;
                }
            }
            System.out.println("Вещь - " + name + " владельца : " + thing.getOwner() + " развешена");
        }
        finish();
    }
}
