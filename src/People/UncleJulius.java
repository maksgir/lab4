package People;

import People.FrechenBoch;
import People.PersonInterface;

import java.util.Objects;

public class UncleJulius implements PersonInterface {
    private boolean isComing;

    @Override
    public void doSomething() {
        System.out.println("Дядя Юлиус приезжает в гости");
        isComing = true;
    }

    public void sayFrechen(FrechenBoch frechen){
        frechen.doSomething();
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
