package classes;

import util.PersonInterface;

public class FrechenBoch implements PersonInterface {
    private boolean energy = true;
    private boolean time = true;
    private boolean resistance = true;


    @Override
    public void doSomething() {
        isResistible();
        provideBoy();

    }

    public void isCooking(boolean arrive) {
        if (arrive) {
            System.out.println("Фрекен Бок нужно жарить ципленка по этому случаю");
            energy = false;
            time = false;
        } else {
            System.out.println("Фрекен Бок отдыхает");
        }
    }

    public void isResistible() {
        if (!energy && !time) {
            resistance = false;
            System.out.println("но у нее уже не было ни сил, ни времени оказывать дальнейшее сопротивление, потому что она жарила цыпленка");
        }
    }

    public void provideBoy() {
        System.out.println("Фрекен Бок дала Малышу что он просил");
    }

    @Override
    public String toString() {
        return "Человек Фрекен Бок";
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();

    }
}