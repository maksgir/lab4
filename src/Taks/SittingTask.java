package Taks;

import Place.PlaceInterface;
import Time.TimeInterface;

public class SittingTask extends TasksAbstract {
    private PlaceInterface place;
    private TimeInterface time;

    public SittingTask(String name, PlaceInterface place, TimeInterface time) {
        super(name);
        this.place = place;
        this.time = time;
    }

    public String getPlace() {
        return place.toString();
    }

    public String getTime() {
        return time.getTime();
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
