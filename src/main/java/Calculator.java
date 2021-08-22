public class Calculator {
    CalculatorOperations calculatorOperations;
    public Calculator(CalculatorOperations calculatorOperations){
        this.calculatorOperations = calculatorOperations;
    }
    public double sum(double num1, double num2) {
        return calculatorOperations.sum(num1, num2);
    }
    public double difference(double num1, double num2) {
        return calculatorOperations.difference(num1, num2);
    }

    public double product(double num1, double num2) {
        return calculatorOperations.product(num1, num2);
    }

    public double division(double num1, double num2) {
        return calculatorOperations.division(num1, num2);
    }
}

