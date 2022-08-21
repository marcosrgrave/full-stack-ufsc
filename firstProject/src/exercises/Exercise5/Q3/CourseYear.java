package exercises.Exercise5.Q3;

public class CourseYear extends Course {

    private float score3;
    private float score4;

    public float getScore3() {
        return this.score3;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }

    public float getScore4() {
        return this.score4;
    }

    public void setScore4(float score4) {
        this.score4 = score4;
    }

    public float averageScore() {
        return (this.score2 + this.score4) * 4 / 5 + (this.score1 + this.score3) * 1 / 5;
    }

    public boolean scoreResult() {
        if (this.averageScore() > 7) {
            return true;
        }
        return false;
    }

}
