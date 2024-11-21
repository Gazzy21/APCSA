
public class Rectangle {
    private int length;
    private int width;
    private String color;

    public Rectangle(String rColor, int rWidth, int rLength) {
        color = rColor;
        width = rWidth;
        length = rLength;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
