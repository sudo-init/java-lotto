package calculator.view;

import java.util.Scanner;

public class ReceiveExpression {

    private Scanner scanner;

    public ReceiveExpression() {
        this.scanner = new Scanner(System.in);
    }

    public String getExpression() {
        return this.scanner.nextLine();
    }

}
