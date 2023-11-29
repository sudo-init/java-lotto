package calculator;

public class Calculator {

    private int result = 0;
    private int operand = 0;
    private String operator = "";

    public int calculate(String expression) {
        String[] values = expression.split(" ");  // 스플리터
        // 연산자 객체
        // 피연산자 객체

        for (String value: values) {
            if (value.matches("\\d+")) {
                this.operand = Integer.parseInt(value);
            } else {
                this.operator = value;
                continue;
            }

            if (this.operator.isEmpty()) {
                this.result = operand;
                continue;
            }

            runCalc();
        }
        return this.result;
    }

    private void runCalc() {
        if (this.operator.equals("+")) {
            add();
        } else if (this.operator.equals("-")) {
            subtract();
        } else if (this.operator.equals("*")) {
            multiply();
        } else if (this.operator.equals("/")) {
            divide();
        }
    }

    private void divide() {
        this.result /= this.operand;
    }

    private void multiply() {
        this.result *= this.operand;
    }

    private void subtract() {
        this.result -= this.operand;
    }

    private void add() {
        this.result += this.operand;
    }
}
