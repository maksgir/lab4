package Taks;

public class BathrobeTask extends TasksAbstract {

    public BathrobeTask(String task) {
        super(task);
    }
    @Override
    public String getTask() {
        return "найти купальный халат";
    }
    @Override
    public void complete() {
        System.out.println("Нашел купальный халат");
        finish();
    }

    @Override
    public String toString() {
        return super.toString();
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
