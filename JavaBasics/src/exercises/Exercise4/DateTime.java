package exercises.Exercise4;

import exercises.Exercise3.Q2.Date;

public class DateTime {

    private Date date;
    private Time time;

    public DateTime(String date) {
        this.date = new Date(date);
        this.time = new Time("00:00:00");
    }

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public DateTime(String date, String time) {
        this.date = new Date(date);
        this.time = new Time(time);
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = new Date(date);
    }

    public Time getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = new Time(time);
    }

    public String toString() {
        return this.date.toString() + " " + this.time.toString();
    }

    public DateTime clone() {
        DateTime clone = new DateTime(this.date, this.time);
        return clone;
    }

}
