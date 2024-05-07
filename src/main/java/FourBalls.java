import processing.core.PApplet;

public class FourBalls extends PApplet {
    int ball1XPos, ball2XPos, ball3XPos, ball4XPos = 0;
    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(640, 480);
    }

    @Override
    public void draw() {
        ellipse(ball1XPos, (float) 1 /5 * 500, 15, 15);
        ellipse(ball2XPos, (float) 2 /5 * 500, 15, 15);
        ellipse(ball3XPos, (float) 3 /5 * 500, 15, 15);
        ellipse(ball4XPos, (float) 4 /5 * 500, 15, 15);
        ball1XPos += 1;
        ball2XPos += 2;
        ball3XPos += 3;
        ball4XPos += 4;
    }

}
