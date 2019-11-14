package exercises.number9;

import java.util.Scanner;

public class equationSolverApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of equation: a*x +b =0\n");

        System.out.print("enter a:\n");
        double a=input.nextFloat();
        System.out.print("enter b:\n");
        double b=input.nextFloat();

        EquationSolver.solveEq1(a,b);


    }
}
