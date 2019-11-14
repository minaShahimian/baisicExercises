package exercises.number16;

public class tryCatch {
    public static void main(String[] args) {
       float Result;
        try {
            Result=Divide(80, 20);
            System.out.println("The result is = "+Result);
        }
        catch (Exception ex){
            System.out.println("something went wrong:");
            System.out.println("Exception is = "+ex);
        }
        finally {
            System.out.println("Finally block. ");
        }

    }
    public static int Divide(int a, int b){

        return a/b;
    }
}
