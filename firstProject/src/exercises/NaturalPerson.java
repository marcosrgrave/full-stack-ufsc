package exercises;

public class NaturalPerson extends Person {

    private String socialNumber;
    private float workHours;
    private float hourCompensation;
    private float salesResult;
    private float comissionPercent;

    public String getSocialNumber() {
        return this.socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public float getWorkHours() {
        return this.workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    public float getHourCompensation() {
        return this.hourCompensation;
    }

    public void setHourCompensation(float hourCompensation) {
        this.hourCompensation = hourCompensation;
    }

    public float getSalesResult() {
        return this.salesResult;
    }

    public void setSalesResult(float salesResult) {
        this.salesResult = salesResult;
    }

    public float getComissionPercent() {
        return this.comissionPercent;
    }

    public void setComissionPercent(float comissionPercent) {
        this.comissionPercent = comissionPercent;
    }

    public float grossSalary() {
        if (this.comissionPercent > 0) {
            return this.salesResult * this.comissionPercent;
        }
        return this.workHours * this.hourCompensation;
    }

}
