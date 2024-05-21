import processing.core.PApplet;

public class Ball {
    private int xPos;
    private final float yPos;
    private final int speed;
    private final int diameter = 15;

    public Ball(float yPos, int speed) {
        this.yPos = yPos;
        this.speed = speed;
    }

    public void move() {
        xPos += speed;
    }

    public void display(PApplet sketch) {
        sketch.ellipse(xPos, yPos, diameter, diameter);
    }
}