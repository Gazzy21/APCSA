import java.awt.*;

public class SizeChangingBall extends Ball {
    private int MaxDiameter, MinDiameter;
    private int diameterStep;

    public SizeChangingBall(int xStart, int yStart, Color c, int maxD) {
        super(xStart, yStart, c);
        MaxDiameter = maxD;
        MinDiameter = 2;
        diameterStep = 1;
    }

    public void changeDiameter() {
        int diam = getDiam();
        diam += diameterStep;
        if(diam >= MaxDiameter || diam <= MinDiameter) {
            diameterStep = -diameterStep;
        }
        setDiam(diam);
    }
    
    public void move(int width, int height) {
        super.move(width, height);
        changeDiameter();
    }
}