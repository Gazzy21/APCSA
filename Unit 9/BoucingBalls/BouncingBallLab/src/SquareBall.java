import java.awt.*;

/**
 * Creates a square ball object that bounces off the walls.
 * 
 * @author kimberly.jans
 * @version March 10, 2025
 */
public class SquareBall extends Ball {

    /**
     * Default constructor
     * Creates a black square ball at (0, 0) with side length 10 and xStep = 5, yStep = 3
     * using the other constructor of Ball.
     */
    public SquareBall() {
        super(0, 0, 10, 5, 3, Color.BLACK); // Call the parent constructor with default values
    }

    /**
     * Constructor
     * @param x - x position
     * @param y - y position
     * @param c - color of the square ball
     * Creates a square ball with side length 10, xStep = 5, and yStep = 3
     * using the other constructor of Ball.
     */
    public SquareBall(int x, int y, Color c) {
        super(x, y, 10, 5, 3, c); // Call the parent constructor
    }

    /**
     * Constructor - sets all the instance variables for the square ball.
     * 
     * @param x     - x position
     * @param y     - y position
     * @param d     - side length (diameter in the case of a ball)
     * @param xMove - x translation (movement offset)
     * @param yMove - y translation (movement offset)
     * @param c     - Color of the square ball
     */
    public SquareBall(int x, int y, int d, int xMove, int yMove, Color c) {
        super(x, y, d, xMove, yMove, c); // Call the parent constructor
    }

    /**
     * Override the drawBall() method to draw a square instead of a circle
     */
    @Override
    public void drawBall() {
        // Get the side length of the square
        int sideLength = getDiam();
        
        // Draw a square on the screen
        StdDraw.setPenColor(getColor());
        StdDraw.filledRectangle(getX(), getY(), sideLength / 2.0, sideLength / 2.0);  // Draw square instead of circle
    }
}
