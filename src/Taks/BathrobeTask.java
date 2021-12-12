package Taks;

public class BathrobeTask extends TasksAbstract {

    public BathrobeTask(String task) {
        super(task);
    }

    @Override
    public void complete() {
        System.out.println("Нашел купальный халат");
        finish();
    }

}
