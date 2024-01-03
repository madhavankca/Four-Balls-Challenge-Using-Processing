import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void setup() {
        ball1 = new Ball(1, HEIGHT / 5);
        ball2 = new Ball(2, 2 * (HEIGHT / 5));
        ball3 = new Ball(3, 3 * (HEIGHT / 5));
        ball4 = new Ball(4, 4 * (HEIGHT / 5));
    }

    @Override
    public void draw() {
        //paintWhite();
        ball1.move(1);
        ball2.move(2);
        ball3.move(3);
        ball4.move(4);
    }

    private void paintWhite() {
        background(255);
    }

    class Ball {
        int x;
        int height;

        Ball(int initialX, int initialHeight) {
            x = initialX;
            height = initialHeight;
        }
        void move(int speed) {
            x += speed;
            drawCircle();
        }
        void drawCircle() {
            ellipse(x, height, DIAMETER, DIAMETER);
        }
    }
}