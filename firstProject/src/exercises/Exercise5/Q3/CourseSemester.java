package exercises.Exercise5.Q3;

public class CourseSemester extends Course {

    private String registrationSemester;
    private float score3;

    public String getRegistrationSemester() {
        return this.registrationSemester;
    }

    public void setRegistrationSemester(String registrationSemester) {
        this.registrationSemester = registrationSemester;
    }

    public float getScore3() {
        return this.score3;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }

    public float averageScore() {
        return this.score1 * 1 / 4 + this.score2 * 1 / 4 + this.score3 * 1 / 2;
    }

    public boolean scoreResult() {
        if (this.averageScore() > 6) {
            return true;
        }
        return false;
    }

}
