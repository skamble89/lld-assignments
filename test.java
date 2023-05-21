import assignments.complex;

public class test {
    public static void main(String[] args) {
        complex c1 = new complex(1, 2);
        complex c2 = new complex(5, 4);

        complex addition = c1.add(c2);
        complex subtraction = c2.subtract(c1);

        System.out.println(addition);
        System.out.println(subtraction);
    }
}
