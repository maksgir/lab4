package Clothes;

import People.PersonInterface;

import java.util.Objects;

public abstract class ClothesAbstract {
    PersonInterface owner;
    TypeEnum type;
    boolean isHanged;

    public ClothesAbstract(PersonInterface owner) {
        this.owner = owner;
        isHanged = false;
    }

    public void dry() {
        isHanged = true;
    }

    public PersonInterface getOwner() {
        return owner;
    }

    public String getType() {
        return type.toString();
    }


    @Override
    public String toString() {
        String hang = isHanged ? "развешена" : "неразвешена";
        return "Вещь" +
                "владельца=" + owner +
                ", типа:" + type +
                ", " + hang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothesAbstract that = (ClothesAbstract) o;
        return isHanged == that.isHanged && Objects.equals(owner, that.owner) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, type, isHanged);
    }
}
