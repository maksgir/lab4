package Clothes;

import Creatures.PersonInterface;

public class Sneakers extends ClothesAbstract {
    public Sneakers(PersonInterface owner) {
        super(owner);
        this.type = TypeEnum.SNEAKERS;
    }

    @Override
    public String toString() {
        String hang = this.isHanged ? "развешена" : "неразвешена";
        return "Кроссовки" +
                "владельца=" + owner +
                ", типа:" + type +
                ", " + hang;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
