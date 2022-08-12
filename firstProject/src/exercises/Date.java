package exercises;

public class Date {

    private int dayInt;
    private int monthInt;
    private int yearInt;
    private String dayString;
    private String monthString;
    private String yearString;

    public Date(int year) {
        this.yearInt = year;
        this.dayInt = 1;
        this.monthInt = 1;
    }

    public Date(String date) {
        String[] dateArray = date.split("/");
        this.dayString = dateArray[0];
        this.monthString = dateArray[1];
        this.yearString = dateArray[2];
    }

    public Date(int day, int month, int year) {
        this.dayInt = day;
        this.monthInt = month;
        this.yearInt = year;
        this.dayString = String.valueOf(day);
        this.monthString = String.valueOf(month);
        this.yearString = String.valueOf(year);
    }

    public String getDay() {
        return this.dayString;
    }

    public String getMonth() {
        return this.monthString;
    }

    public String getMonthWord() {
        return "";
    }

    public String getYear() {
        return this.yearString;
    }

    public String getYear2Digits() {
        return this.yearString.substring(2, 4);
    }

    public boolean isLeapYear() {
        boolean isLeapYear = this.yearInt % 400 == 0;
        return isLeapYear;
    }

    public String toString() {
        return this.dayString + "/" + this.monthString + "/" + this.yearString;
    }

    public Date clone() {
        Date clone = new Date(this.dayInt, this.monthInt, this.yearInt);
        return clone;
    }

    public int compare(Date date) {
        if (date.toString() == this.toString()) {
            return 0;
        } else if (date.yearInt < this.yearInt) {
            return 1;
        }
        return -1;
    }

}
