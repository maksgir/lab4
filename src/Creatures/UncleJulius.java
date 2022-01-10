package Creatures;

import Exceptions.UncleIsNotComingException;

import java.util.Objects;

public class UncleJulius implements PersonInterface {
    private boolean isComing;

    @Override
    public void doSomething() {
        System.out.println("Дядя Юлиус приезжает в гости");
        isComing = true;
    }

    public boolean getIsComing() {
        return isComing;
    }

    public void sayFrechen(FrechenBoch frechen) throws UncleIsNotComingException {
        if (getIsComing()) {
            frechen.doSomething();
        } else {
            throw new UncleIsNotComingException("Дядя Юлиус обманул Фрекен Бок и не приедет");
        }
    }

    @Override
    public String toString() {
        return "Дядя Юлиус";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UncleJulius that = (UncleJulius) o;
        return isComing == that.isComing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isComing);
    }
}
