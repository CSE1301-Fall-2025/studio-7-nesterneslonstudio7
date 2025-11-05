public class Fraction {
    int numerator;
    int denominator;
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction addFraction(Fraction other){
        return new Fraction((this.numerator * other.denominator) + (other.numerator * this.denominator), (this.denominator * other.denominator));
    }
    public Fraction multiplyFraction(Fraction other){
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }
    public String display(){
        return numerator + "/" + denominator;
    }
    public Fraction simplify(){
        denominator = this.denominator;
        numerator = this.numerator;
        for(int i = denominator; i > 1; i--){
            if(denominator % i == 0 && numerator % i == 0){
                denominator = denominator/i;
                numerator = numerator/i;
            }
        }
        return new Fraction(numerator, denominator);
    }
}
