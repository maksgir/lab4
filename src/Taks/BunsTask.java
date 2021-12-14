package Taks;

public class BunsTask extends TasksAbstract {
    public BunsTask(String name) {
        super(name);
    }
    @Override
    public String getTask() {
        return "найти плюшки";
    }
    @Override
    public void complete() {
        System.out.println("Нашел плюшки");
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
