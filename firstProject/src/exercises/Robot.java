package exercises;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

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
        this.id = uniqueID();
        this.coordX = coordX;
        this.coordY = coordY;
        System.out.println("Robot initialized...");
    }

    public static String uniqueID() {
        int randomInteger = ThreadLocalRandom.current().nextInt(0, 429496729 + 1);
        String id = Integer.toHexString(randomInteger);
        return id;
    }

    public static String uniqueUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
