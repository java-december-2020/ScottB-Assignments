public class CalculatorController {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setOperandOne(10.5);
        calc.setOperandTwo(5.2);
        calc.setOperation('+');
        calc.performOperation();
        calc.getResults();

        calc.setOperation('-');
        calc.setOperandTwo(5.5);
        calc.performOperation();
        calc.getResults();
    }
}