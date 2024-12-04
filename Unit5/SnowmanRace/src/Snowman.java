public class Snowman {
    private double x;
    private double y;
    private String pictureFile;
    private String name;

    public Snowman(double initialX, double initialY, String snowmanPicture, String snowmanName) {
        initialX = x;
        initialY = y;
        pictureFile = snowmanPicture;
        snowmanName = name;
    }

    public void move() {
        x += Math.floor(Math.random() * 8) + 1;
    }

    public String getName() {
        return pictureFile;
    }

    public double getX() {
        return x;
    }

    public void draw() {
        StdDraw.picture(x, y, pictureFile, 50, 60);
    }
}
