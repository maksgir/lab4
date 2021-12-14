package Taks;

public class ChocolateTask extends TasksAbstract {

    public ChocolateTask(String name) {
        super(name);
    }
    @Override
    public String getTask() {
        return "найти горячий шоколад";
    }
    @Override
    public void complete() {
        System.out.println("Нашел горячий шоколад");
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
