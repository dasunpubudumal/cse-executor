package it.uom.cse;

import java.util.Arrays;
import java.util.Scanner;

import static it.uom.cse.util.StringUtil.operandArray;

public class Executor
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println( "====== CSE WORKSHOP - EXECUTOR ======" );
        execute();
        System.out.println( "====== CSE WORKSHOP - EXECUTOR ======" );
    }

    private static void execute()
    {
        boolean execute = true;
        while (execute) {
        System.out.println("Please enter the operation: ");
        String operation = scanner.nextLine();
        if (operation.equalsIgnoreCase(OperationType.EXIT.getOpeartionString())) execute = false;
        else if (operation.equalsIgnoreCase(OperationType.ADD.getOpeartionString())) {
            System.out.println("Enter operands as a list (e.g. 1,2,3,4)");
            String operands = scanner.nextLine();
            double[] operandArray = operandArray(operands);
            System.out.printf("Sum: %f%n", Arrays.stream(operandArray).sum());
        }
        else if (operation.equalsIgnoreCase(OperationType.MULT.getOpeartionString())) {
            System.out.println("Enter the two operands as a list (e.g. 2,5)");
            String operands = scanner.nextLine();
            double[] operandArray = operandArray(operands);
            System.out.printf("Multiplication: %f%n", Arrays.stream(operandArray).reduce(1, (a,b) -> a*b));
        }
        else { System.err.println("Please enter valid operation type."); }
        }
    }

}
