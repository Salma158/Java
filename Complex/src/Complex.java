
public class Complex<T extends Number> {
    private T real;
    private T imaginary;

    public Complex(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imaginary;
    }

    public Complex<T> add(Complex<T> other) {
        T newReal = add(real, other.getReal());
        T newImaginary = add(imaginary, other.getImaginary());
        return new Complex<>(newReal, newImaginary);
    }

    public Complex<T> subtract(Complex<T> other) {
        T newReal = subtract(real, other.getReal());
        T newImaginary = subtract(imaginary, other.getImaginary());
        return new Complex<>(newReal, newImaginary);
    }

    public Complex<T> multiply(Complex<T> other) {
        T newReal = subtract(multiply(real, other.getReal()), multiply(imaginary, other.getImaginary()));
        T newImaginary = add(multiply(real, other.getImaginary()), multiply(imaginary, other.getReal()));
        return new Complex<>(newReal, newImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    private T add(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf( a.doubleValue() +  b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }

    private T subtract(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
    }

    private T multiply(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf( a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else {
            return (T) Integer.valueOf( a.intValue() * b.intValue());
        }
    }

    public static void main(String[] args) {
        Complex<Double> complex1 = new Complex<>(1.5, 2.0);
        Complex<Double> complex2 = new Complex<>(2.5, 1.5);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        Complex<Double> sum = complex1.add(complex2);
        System.out.println("Sum: " + sum);

        Complex<Double> difference = complex1.subtract(complex2);
        System.out.println("Difference: " + difference);

        Complex<Double> product = complex1.multiply(complex2);
        System.out.println("Product: " + product);
    }
}
