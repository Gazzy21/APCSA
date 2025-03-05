import java.awt.Color;

public class SmileyBall extends Ball {
    private double x, y, radius;  // Position (x, y) and size (radius) of the ball
    
    // Default constructor for SmileyBall
    public SmileyBall(double x, double y, double radius) {
        super();  // Call the constructor of Ball (super class)
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Override the drawBall method to draw a SmileyBall
    @Override
    public void drawBall() {
        // Draw the ball as a filled circle
        StdDraw.setPenColor(Color.YELLOW);
        StdDraw.filledCircle(x, y, radius);

        // Draw the smiley face features
        drawSmileyFace();
    }

    // Helper method to draw a smiley face inside the ball
    private void drawSmileyFace() {
        // Draw the eyes
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.filledCircle(x - radius / 3, y + radius / 3, radius / 8);  // Left eye
        StdDraw.filledCircle(x + radius / 3, y + radius / 3, radius / 8);  // Right eye

        // Draw the smile
        StdDraw.setPenColor(Color.RED);
        StdDraw.arc(x, y - radius / 6, radius / 2, 180, 0, -180);
    }
}
