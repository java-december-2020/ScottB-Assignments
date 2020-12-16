public class Calculator {
    private double results;
    private double operandOne;
    private double operandTwo;
    private char operator;

    public Calculator() {

    }

    public void setOperandOne(double input) {
        this.operandOne = input;
    }

    public void setOperandTwo(double input) {
        this.operandTwo = input;
    }

    public void setOperation(char input) {
        this.operator = input;
    }

    public void performOperation() {
        if (this.operator == '+') {
            results = (operandOne) + (operandTwo);
        }
        if (this.operator == '-') {
            results = (operandOne) - (operandTwo);
        }
    }

    public void getResults() {
        System.out.println(results);
    }
}