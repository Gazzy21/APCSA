public class LineSegment {
    private Point p1;
    private Point p2;
    private String l1;
    private String l2;
    
    public LineSegment(Point point1, Point point2, String label1, String label2) {
        p1 = point1;
        p2 = point2;
        l1 = label1;
        l2 = label2;
    }

    public LineSegment(Point point1, Point point2) {
       this(point1, point2, "A", "B");
    }

    public Point getPoint1() {
        return p1;
    }

    public Point getPoint2() {
        return p2;
    }

    public String getLabel1() {
        return l1;
    }

    public String getLabel2() {
        return l2;
    }

    public void String toString() {
        return ("(" + p1 + "," + p2 + ")" + " " + l1 + l2);
    }

    public double LengthofSegment() {
        double diffX = p1.getX() - p2.getX();
        double diffY = p1.getY() - p2.getY();
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }
}