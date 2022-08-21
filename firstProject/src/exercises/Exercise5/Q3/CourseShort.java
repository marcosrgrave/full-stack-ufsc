package exercises.Exercise5.Q3;

public class CourseShort extends Course {

    private String registrationMonth;

    public String getRegistrationMonth() {
        return this.registrationMonth;
    }

    public void setRegistrationMonth(String registrationMonth) {
        this.registrationMonth = registrationMonth;
    }

    public float averageScore() {
        return (this.score1 + this.score2) / 2;
    }

    public boolean scoreResult() {
        if (this.averageScore() >= 5) {
            return true;
        }
        return false;
    }

}
