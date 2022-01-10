package Creatures;

import java.util.Objects;

public class FrechenBoch implements PersonInterface {
    private int energy = 50;
    private int freeTime = 50;
    private boolean resistance = true;


    @Override
    public void doSomething() {
        System.out.println("По этому случаю Фрекен Бок жарит ципленка");
        energy -= 50;
        freeTime -= 50;
    }

    public void relax() {
        System.out.println("Фрекен Бок отдыхвет");
        energy += 50;
        freeTime += 50;
    }

    public boolean helpBoy() {
        if (isResistance()) {
            System.out.println("У Фрекен Бок есть силы и время оказывать сопротивление Малышу");
            return false;
        } else {
            System.out.println("У Фрекен Бок нет ни сил и ни времени оказывать сопротивление Малышу");
            return true;
        }

    }

    public boolean isResistance() {
        resistance = (isLow(energy) && isLow(freeTime));
        return !resistance;
    }

    private boolean isLow(int condition) {
        return (condition < 30);
    }

    @Override
    public String toString() {
        return "Фрекен Бок";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrechenBoch that = (FrechenBoch) o;
        return energy == that.energy && freeTime == that.freeTime && resistance == that.resistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(energy, freeTime, resistance);
    }
}
