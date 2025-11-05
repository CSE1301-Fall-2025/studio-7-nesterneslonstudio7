public class Rectangle {
    public double width;
    public double height;
    public String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    // public void draw() {
    // System.out.println("Drawing a " + color + " rectangle of width " + width + "
    // and height " + height);
    // StdDraw.setPenColor(StdDraw.colorFromString(color));
    // StdDraw.filledRectangle(width / 2, height / 2, width / 2, height / 2);
    // }

    public boolean isSquare() {
        return width == height;
    }

    public boolean isSmallerThan(Rectangle other) {
        return this.area() < other.area();
    }
}
