package exercises;

public class Robot {

    private String id;
    private float coordX;
    private float coordY;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCoordX() {
        return this.coordX;
    }

    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }

    public float getCoordY() {
        return this.coordY;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }

    public Robot(float coordX, float coordY) {
        this.id = GenerateID.uniqueID();
        this.coordX = coordX;
        this.coordY = coordY;
        System.out.println("Robot initialized...");
    }

}
