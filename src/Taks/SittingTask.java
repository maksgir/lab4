package Taks;

public class SittingTask extends TasksAbstract {

    public SittingTask(String name, String place, String time) {
        super(name);
        setPlace(place);
        setTime(time);
    }

    @Override
    public String getTask() {
        return String.format("посидеть %s %s", getPlace(), getTime());
    }

    @Override
    public void complete() {
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
