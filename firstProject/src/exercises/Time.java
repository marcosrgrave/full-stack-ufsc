package exercises;

public class Time {

    private String hour;
    private String minute;
    private String second;

    public Time(String time) {
        String[] timeSplit = time.split(":");
        this.hour = timeSplit[0];
        this.minute = timeSplit[1];
        this.second = timeSplit[2];
    }

    public Time(String hour, String minute, String second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getHour() {
        return this.hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return this.minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getSecond() {
        return this.second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }

}
