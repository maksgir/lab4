import classes.*;
import util.TasksEnum;

public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Carlson carlson = new Carlson();
        FrechenBoch frechenBoch = new FrechenBoch();
        UncleJulius uncleJulius = new UncleJulius();
        boy.doSomething();
        uncleJulius.doSomething();
        frechenBoch.isCooking(uncleJulius.getIsComing());

        for (TasksEnum x : TasksEnum.values()) {
            Task task = new Task(x);
            carlson.setTask(task);
            boy.setTask(carlson.sayTask());
            boy.doTask();
            if (boy.askFrechenBoch()) {
                frechenBoch.doSomething();
                boy.completeTask();
            }

        }
        try {
            Thread.sleep(2000);
            System.out.print("Несколько минут спустя ");
            carlson.doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
