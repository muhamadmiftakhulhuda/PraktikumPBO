import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please Input Number 1 => ");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = scanner.nextDouble();
            System.out.print("Please Input Number 2 => ");
            secondNum = scanner.nextDouble();
            System.out.print("Please Input Calculator Sign => ");
            operator = scanner.next().charAt(0);
        } catch (InputMismatchException ime) {
            System.out.print("invalid input");
        } finally {
            if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
                throw new InputMismatchException();
            }
            Calculation calculation = new Calculation(firstNum, secondNum, operator);
            System.out.print("The Result is");
            System.out.print(calculation.makeCalculation());
        }
    }
}