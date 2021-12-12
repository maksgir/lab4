package Taks;

public class ChocolateTask extends TasksAbstract {

    public ChocolateTask(String name) {
        super(name);
    }

    @Override
    public void complete() {
        System.out.println("Нашел горячий шоколад");
        finish();
    }


}
