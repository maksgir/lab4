package People;

import Taks.TasksAbstract;

public class Boy implements PersonInterface {
    private TasksAbstract task;

    @Override
    public void doSomething() {
        System.out.println();
    }

    public void askCarlson(TasksAbstract newTask){
        System.out.print("Малыш получил задание - ");
        switch (newTask.getTask()){
            case "BATHROBE":
                System.out.println("найти купальный халат");
                break;
            case "CHOCOLATE":
                System.out.println("найти горячий шоколад");
                break;
            case "BUNS":
                System.out.println("найти плюшки");
                break;
            case "CLOTHES":
                System.out.println("развесить одежду");
                break;
        }
        this.task = newTask;
    }

    public void askForHelp(FrechenBoch frechen){
        System.out.println("Малыш просит помощь у Фрекен Бок");
        if (frechen.helpBoy()){
            System.out.println("Фрекен Бок дала Малышу что он просил");
            doTask();
        } else{
            System.out.println("Фрекен Бок не дала Малышу что он просил :(");
        }
    }
    public void collectClothes(){

    }
    public void doTask(){
        task.complete();
    }


    @Override
    public String toString() {
        return "Человек Малыш";
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
