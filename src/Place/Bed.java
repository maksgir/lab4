package Place;

import Creatures.PersonInterface;

import java.util.Objects;

public class Bed implements PlaceInterface {
    public PersonInterface owner;
    public boolean isPlaced;
    public boolean isHeadboardPlaced;

    public Bed(PersonInterface owner) {
        this.owner = owner;
    }

    @Override
    public void takePlace() {
        isPlaced = true;
        System.out.printf("Кровать владельца - %s поставлена%n", owner.toString());
    }

    public class Headboard implements PlaceInterface {

        @Override
        public void takePlace() {
            isHeadboardPlaced = true;
            System.out.printf("Изголовье кровати владельца - %s поставлено%n", owner.toString());
        }

        @Override
        public PersonInterface getOwner() {
            return owner;
        }

        @Override
        public String toString() {
            return "у изголовья кровати";
        }

    }

    public PersonInterface getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "у кровати";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bed bed = (Bed) o;
        return isPlaced == bed.isPlaced && isHeadboardPlaced == bed.isHeadboardPlaced && Objects.equals(owner, bed.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, isPlaced, isHeadboardPlaced);
    }
}
