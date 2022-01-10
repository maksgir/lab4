package Time;

public class Time implements TimeInterface {
    private String duration;

    @Override
    public void setTime(String duration) {
        this.duration = duration;
    }

    @Override
    public String getTime() {
        return duration;
    }
}
