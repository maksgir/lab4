package Clothes;

import Creatures.PersonInterface;

public class Socks extends ClothesAbstract {
    public Socks(PersonInterface owner) {
        super(owner);
        this.type = TypeEnum.SOCKS;
    }

    @Override
    public String toString() {
        String hang = this.isHanged ? "развешена" : "неразвешена";
        return "Носки" +
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
