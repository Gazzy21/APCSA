
public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("blue", 10, 5);
        Rectangle r2 = new Rectangle("red", 5, 10);

        String c = r1.getColor();
        System.out.println("r1 color is: " + c);
        System.out.println("r1 length is: " + r1.getLength());
    }
}
