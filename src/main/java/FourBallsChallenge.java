import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int BALL_HEIGHT = 500;


    Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

        for (int i = 0; i < balls.length; i++) {
            float yPos = (float) ((i + 1) * BALL_HEIGHT) / 5;
            int speed = i + 1;
            balls[i] = new Ball(this, yPos, speed);
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.move();
            ball.display();
        }
    }
}
