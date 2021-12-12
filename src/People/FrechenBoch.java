package People;

public class FrechenBoch implements PersonInterface {
    private int energy = 100;
    private int freeTime = 100;
    private boolean resistance = true;


    @Override
    public void doSomething() {
        System.out.println("По этому случаю Фрекен Бок жарит ципленка");
        energy -= 100;
        freeTime -= 100;
    }

    public boolean helpBoy(){
        if (isResistance()){
            System.out.println("У Фрекен Бок есть силы и время оказывать сопротивление Малышу");
            return false;
        } else {
            System.out.println("У Фрекен Бок нет ни сил и ни времени оказывать сопротивление Малышу");
            return true;
        }

    }

    public boolean isResistance(){
        resistance = (isLow(energy) && isLow(freeTime));
        return !resistance;
    }

    private boolean isLow(int condition){
        return (condition ==0);
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