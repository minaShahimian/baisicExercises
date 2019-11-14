package exercises.number9;

public class EquationSolver {
    //a*x+b=0
    public static void solveEq1(double a,double b){
        double x=-b/a;
        System.out.print("solving equal:\n");
        System.out.format("%f * x +%f=0\n",a,b);
        System.out.format("result: x=%f",x);

    }
}
