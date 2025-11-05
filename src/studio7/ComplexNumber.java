public class ComplexNumber {
    public double real;
    public double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumber(4.0, 5.0);
        ComplexNumber sum = num1.add(num2);
        ComplexNumber product = num1.multiply(num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
