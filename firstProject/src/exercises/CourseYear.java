package exercises;

public class CourseYear extends Course {

    private float score3;
    private float score4;

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
