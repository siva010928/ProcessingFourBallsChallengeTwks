import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BallHeight = 500;

    static class Ball {
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
            float yPos = (float) ((i + 1) * BallHeight) / 5;
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
