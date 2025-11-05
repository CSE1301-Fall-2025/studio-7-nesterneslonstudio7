public class Die {
    public int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }

    public static void main(String[] args) {
        Die die1 = new Die(6);
        System.out.println("Rolling a 6-sided die: " + die1.roll());
        Die die2 = new Die(12);
        System.out.println("Rolling a 6-sided die: " + die2.roll());
    }
}
