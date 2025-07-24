package practice_1;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int addThreeNumbers(int a, int b, int c) {
        return add(add(a, b), c);
    }

    public int addFourNumbers(int a, int b, int c, int d) {
        return add(add(add(a, b), c), d);
    }
}

