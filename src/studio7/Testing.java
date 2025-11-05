
public class Testing {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4.0, 5.0, "red");
        Rectangle rect2 = new Rectangle(3.0, 3.0, "blue");

        System.out.println("Area of rect1: " + rect1.area());
        System.out.println("Perimeter of rect1: " + rect1.perimeter());
        System.out.println("Is rect1 a square? " + rect1.isSquare());

        System.out.println("Area of rect2: " + rect2.area());
        System.out.println("Perimeter of rect2: " + rect2.perimeter());
        System.out.println("Is rect2 a square? " + rect2.isSquare());

        System.out.println("Is rect1 smaller than rect2? " + rect1.isSmallerThan(rect2));
    }

}
