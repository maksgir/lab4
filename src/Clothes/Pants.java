package Clothes;

import Creatures.PersonInterface;

public class Pants extends ClothesAbstract {
    public Pants(PersonInterface owner) {
        super(owner);
        this.type = TypeEnum.PANTS;
    }

    @Override
    public String toString() {
        String hang = this.isHanged ? "развешена" : "неразвешена";
        return "Штаны" +
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
