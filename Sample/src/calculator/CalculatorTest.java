package calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(20, 30));
        System.out.println(calculator.subtract(20, 30));
        System.out.println(calculator.multiply(20, 30));
        System.out.println(calculator.division(20, 30));
    }
}
