package People;

import People.FrechenBoch;
import People.PersonInterface;

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
        return "Человек Дядя Юлиус";
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
