package classes;

import util.PersonInterface;

public class UncleJulius implements PersonInterface {
    private final boolean isComing = true;

    @Override
    public void doSomething() {
        if (isComing) {
            System.out.println("Дядя Юлиус приезжает в гости к Фрекен Бок");

        } else {
            System.out.println("Дядя Юлиус не приезжает в гости к Фрекен Бок");
        }
    }
    public boolean getIsComing(){
        return isComing;
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
