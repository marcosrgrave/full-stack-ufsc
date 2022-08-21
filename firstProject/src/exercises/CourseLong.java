package exercises;

public class CourseLong extends Course {

    private String courseDuration; // in months
    private float score3;

    public float averageScore() {
        return this.score1 * 1 / 3 + this.score2 * 1 / 3 + this.score3 * 1 / 3;
    }

    public String finalAverage() {
        if (this.averageScore() > 9) {
            return "A";
        } else if (this.averageScore() > 7) {
            return "B";
        } else if (this.averageScore() > 5) {
            return "C";
        }
        return "D";
    }

    public boolean scoreResult() {
        if (this.finalAverage() == "A" || this.finalAverage() == "B") {
            return true;
        }
        return false;
    }

}
