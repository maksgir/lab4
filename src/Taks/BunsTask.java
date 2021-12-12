package Taks;

public class BunsTask extends TasksAbstract {
    public BunsTask(String name) {
        super(name);
    }

    @Override
    public void complete() {
        System.out.println("Нашел плюшки");
        finish();
    }
}
