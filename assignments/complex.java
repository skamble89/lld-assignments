package assignments;

public class complex {
    public int real;
    public int imaginary;

    public complex() {
    }

    public complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public complex add(complex a) {
        return new complex(this.real + a.real, this.imaginary + a.imaginary);
    }

    public complex subtract(complex a) {
        return new complex(this.real - a.real, this.imaginary - a.imaginary);
    }

    public String toString() {
        return this.real + (this.imaginary < 0 ? "-" : "+") + "i" + this.imaginary;
    }
}