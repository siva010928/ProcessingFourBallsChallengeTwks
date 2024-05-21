import processing.core.PApplet;

public class Ball {
    private final PApplet sketch;
    private int xPos;
    private final float yPos;
    private final int speed;
    private final int diameter = 15;

    public Ball(PApplet sketch, float yPos, int speed) {
        this.sketch = sketch;
        this.xPos = 0;
        this.yPos = yPos;
        this.speed = speed;
    }

    public void move() {
        xPos += speed;
    }

    public void display() {
        sketch.ellipse(xPos, yPos, diameter, diameter);
    }
}