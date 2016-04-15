public class Main {
    private static final String ENTER_EXPRESSION_TEXT = "Enter the calculation expression: ";
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.printf(ENTER_EXPRESSION_TEXT);
        calculator.start();
    }
}