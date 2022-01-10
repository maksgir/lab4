package Clothes;

import Creatures.PersonInterface;

public class Shirt extends ClothesAbstract {
    public Shirt(PersonInterface owner) {
        super(owner);
        this.type = TypeEnum.SHIRTS;
    }

    @Override
    public String toString() {
        String hang = this.isHanged ? "развешена" : "неразвешена";
        return "Рубашка" +
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
